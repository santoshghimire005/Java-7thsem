public class MultithreadingThread {
    
   public static void main(String[] args) {
    A obj1 = new A();
      obj1.start();
      B obj2 = new B();
      obj2.start();
      C obj3= new C();
      obj3.start();
    
   }
    
}
class A extends Thread{
    
    @Override
    public void run(){
        System.out.println("Starting Thread A...");
        for(int i=0; i<100; i++){
            System.out.println("Thread A : "+i);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                System.out.println(ex);
            }
        }
        System.out.println("Thread A finished ");

        
    }
}
class B extends Thread{
    
    @Override
    public void run(){
        System.out.println("Starting Thread B...");
        for(int i=0; i<100; i++){
            System.out.println("Thread B : "+i);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                System.out.println(ex);
            }
        }
        System.out.println("Thread B finished ");

        
    }
}
class C extends Thread{
    
    @Override
    public void run(){
        System.out.println("Starting Thread C...");
        for(int i=0; i<100; i++){
            System.out.println("Thread C : "+i);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                System.out.println(ex);
            }
        }
        System.out.println("Thread C finished ");

        
    }
}
