public class SleepDemo {
    private int i = 10;
    private Object object = new Object();

    public static void main(String[] args) {
        SleepDemo test = new SleepDemo();
        MyThread thread1 = test.new MyThread();
        MyThread thread2 = test.new MyThread();
        thread1.start();
        thread2.start();
    }
    class MyThread extends Thread{
        @Override
        public void run() {
            synchronized (object) {
                i++;
                System.out.println("i:"+i);
                try {
                    System.out.println("Thread: "+Thread.currentThread().getName()+" go to sleep");
                    Thread.currentThread().sleep(10000);
                } catch(InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println("Thread: "+Thread.currentThread().getName()+" sleep over");
                i++;
                System.out.println("i:"+i);
            }
        }
    }
}
