package SynchronizedDemo;

public class SynchronizedBlockDemo extends Thread {
    public void printThread(int n)
    {
        synchronized (this)
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + n + " is working...");
                try {
                    Thread.sleep(600);
                }
                catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        System.out.println("--------------------------");
        try {
            Thread.sleep(1000);
        }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}

class Thread5 extends Thread {
    SynchronizedBlockDemo test;
    Thread5(SynchronizedBlockDemo p) { test = p; }
    public void run() { test.printThread(1); }
}

class Thread6 extends Thread {
    SynchronizedBlockDemo test;
    Thread6(SynchronizedBlockDemo p) { test = p; }
    public void run() { test.printThread(2); }
}

class SynchroTest {
    public static void main(String[] args)
    {
        SynchronizedBlockDemo p = new SynchronizedBlockDemo();
        Thread5 t5 = new Thread5(p);
        Thread6 t6 = new Thread6(p);
        t5.start();
        t6.start();
    }
}

