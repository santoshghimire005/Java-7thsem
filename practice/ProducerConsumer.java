// // Producer Thread: The producer thread will produce items and add them to a shared buffer (a List<Integer>). The buffer has a maximum capacity,
//  say 5 items. If the buffer is full, the producer thread should wait until space is available.

// // Consumer Thread: The consumer thread will consume (remove) items from the buffer. If the buffer is empty, the consumer thread should 
// wait until there are items available.
package practice;

public class ProducerConsumer {
    public static void main(String[] args) {
        final Buffer b= new Buffer();

        new Thread(){
            @Override
            public void run(){
                b.producer(2);
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                b.consumer(2);
            }
        }.start();
        

        
    }
}
class Buffer{
    int item= 5;
    public synchronized void producer(int item){
        if (this.item>=5){
            System.out.println("The buffer is full ");
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("error "+e);
            }
            System.out.println("The item is being produced");
            this.item += item;
            System.out.println("The item is produced");
        }


    }
    public synchronized void consumer(int item){
        
         if(this.item>0){
            System.out.println("item being consumed ");
            this.item -=item;
            System.out.println("item consumed ");
            notify();
        }
       
    }
}