package SynchronizedDemo;

public class StaticSynchronizedDemo extends Thread {
        synchronized public static void printThread(int n)
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
            System.out.println("--------------------------");
            try {
                Thread.sleep(1000);
            }
            catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }
    class Thread7 extends Thread {
        public void run()
        {
            StaticSynchronizedDemo.printThread(1);
        }
    }

    class Thread8 extends Thread {
        public void run()
        {
            StaticSynchronizedDemo.printThread(2);
        }
    }

    class SynchroTest4 {
        public static void main(String[] args)
        {
            Thread7 t7 = new Thread7();
            Thread8 t8 = new Thread8();
            t7.start();
            t8.start();
        }
    }

