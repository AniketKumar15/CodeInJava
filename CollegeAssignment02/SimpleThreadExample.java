// Create a java program that demonstrates the use of multithreading and synchronization.

class Counter {
    int count = 0;

    // Synchronized method to prevent race conditions
    public synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) {
        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        try {
            t1.join();  // Wait for thread t1 to finish
            t2.join();  // Wait for thread t2 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final count: " + c.count);
    }
}
