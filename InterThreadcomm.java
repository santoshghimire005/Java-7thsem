public class InterThreadcomm {
    public static void main(String[] args) {
        final customer c= new customer();

        new Thread(){
            @Override
            public void run(){
                c.withdraw(25000);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                c.deposite(20000);
            }
        }.start();
    }
}
class customer{
    int amount= 10000 ;
    public synchronized void withdraw (int amount){
        System.out.println("Goint to withdraw...");
        if(this.amount<amount){
            System.out.println("Less balance waiting for deposite...");
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println("Error !! "+e);
            }
            this.amount-= amount;
            System.out.println("withdraw completed... with remaining balance "+ this.amount);
        }

    }

public synchronized void deposite(int amount){
    System.out.println("Going to deposite...");
    this.amount +=amount;
    System.out.println("deposite completed....");
    notify();

}
}
