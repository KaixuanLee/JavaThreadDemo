package SynchronizedDemo;

public class MethodsSynchronizedDemo extends Thread {
    synchronized public void printThread(int n) {
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

class Thread3 extends Thread {
    MethodsSynchronizedDemo test;
    Thread3(MethodsSynchronizedDemo p) {
        test = p;
    }
    public void run() {
        test.printThread(1);
    }
}

class Thread4 extends Thread {
    MethodsSynchronizedDemo test;
    Thread4(MethodsSynchronizedDemo p) {
        test = p;
    }
    public void run(){
        test.printThread(2);
    }
}

class SynchroTest2 {
    public static void main(String[] args) {
        MethodsSynchronizedDemo p = new MethodsSynchronizedDemo();
        Thread3 t3 = new Thread3(p);
        Thread4 t4 = new Thread4(p);
        t3.start();
        t4.start();
    }
}

