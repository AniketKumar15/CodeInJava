class EvenThread extends Thread {
  public void run() {
    for (int i = 1; i <= 50; i++) {
      if (i % 2 == 0) {
        System.out.println("Even Number -> " + i);
      }
    }
  }
}

class AlphabetsThread extends Thread {
  public void run() {
    for (char i = 'A'; i <= 'Z'; i++) {
      System.out.println("Alphabets -> " + i);
    }
  }
}

public class ThreadClassTest {
  public static void main(String[] args) {
    EvenThread eThread = new EvenThread();
    AlphabetsThread aThread = new AlphabetsThread();

    eThread.start();
    aThread.start();
  }
}
