//Write a program that demonstrates the use of thread priorities in Java.
import java.io.*;

class MyThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()
		                   + " is running with priority "
		                   + Thread.currentThread().getPriority());
	}
}

public class ThreadPriority {
	public static void main (String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.setName("LowPriority");
		t2.setName("VeryLowPriority");
		t3.setName("HighPriority");

		t1.setPriority(2);
		t2.setPriority(1);
		t3.setPriority(10);

		t1.start();
		t2.start();
		t3.start();
	}
}