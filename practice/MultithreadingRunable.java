package practice;

public class MultithreadingRunable {
    public static void main(String[] args) {
       AA a= new AA();
       Thread t1= new Thread(a);
       t1.start();
       BB b= new BB();
       Thread t2= new Thread(b);
       t2.start();
    }
}
class AA implements Runnable{
   @Override
   public void run(){
    for(int i=0; i<100; i++){
        System.out.println("this is class AA");
    }
    System.out.println("class AA is over");
   }

}
class BB implements Runnable{
    @Override
    public void run(){
     for(int i=0; i<100; i++){
         System.out.println("this is class BB");
     }
     System.out.println("class BB is over");
    }
 
 }
