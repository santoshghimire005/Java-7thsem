package practice;



class MyThread extends Thread {
	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.println("Child Thread");
		}

	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();// Instantiation of a Thread
		t.start();// starting of a Thread
		for (int i = 0; i < 50; i++) {
			System.out.println("main thread");
		}
	}
}

