package SynchronizedDemo;

public class NoSychronizedDemo extends Thread {
    // Non synchronized Code
    public void printThread(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread " + n + " is working...");
            try {
                Thread.sleep(600);
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
        System.out.println("--------------------------");
        try {
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
class Thread1 extends Thread {
    NoSychronizedDemo test;
    Thread1(NoSychronizedDemo p) {
        test = p;
    }
    @Override
    public void run() {
        test.printThread(1);
    }
}

class Thread2 extends Thread {
    NoSychronizedDemo test;
    Thread2(NoSychronizedDemo p) {
        test = p;
    }
    @Override
    public void run() {
        test.printThread(2);
    }
}
class SynchroTest1 {
    public static void main(String[] args) {
        NoSychronizedDemo p = new NoSychronizedDemo();
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);
        t1.start();
        t2.start();
    }
}

