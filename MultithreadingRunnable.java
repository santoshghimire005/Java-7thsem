

public class MultithreadingRunnable {

    public static void main(String[] args) {
        AA a = new AA();// we create the object a of class AA
        Thread t1 = new Thread(a);
        t1.start();
        
        Thread t2= new Thread(new BB());//the compiler creates the object of BB class
        t2.start();

        Thread t3 = new Thread() {//override run method while creating object of Thread
            @Override
            public void run() {
                System.out.println("Starting Thread C...");
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread C : " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
                System.out.println("Thread C finished ");

            }
        };
        t3.start();
        
    }
}

class AA implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting Thread A...");
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread A : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Thread A finished ");

    }

}

class BB implements Runnable {

    @Override
    public void run() {
        System.out.println("Starting Thread B...");
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread B : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Thread B finished ");

    }

}
