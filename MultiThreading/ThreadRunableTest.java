class OddThread implements Runnable {
  public void run() {
    for (int i = 1; i <= 50; i++) {
      if (i % 2 != 0) {
        System.out.println("Even Number -> " + i);
      }
    }
  }
}

class AlphabetsThread implements Runnable {
  public void run() {
    for (char i = 'a'; i <= 'z'; i++) {
      System.out.println("Alphabets -> " + i);
    }
  }
}

public class ThreadRunableTest {
  public static void main(String[] args) {
    OddThread oThread = new OddThread();
    AlphabetsThread aThread = new AlphabetsThread();

    Thread ob1 = new Thread(oThread);
    Thread ob2 = new Thread(aThread);

    ob1.start();
    ob2.start();
  }
}
