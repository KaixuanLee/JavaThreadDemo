public class InterruptDemo {
    public static void main(String[] args)  {
        InterruptDemo test = new InterruptDemo();
        MyThread thread = test.new MyThread();
        thread.start();
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {

        }
        thread.interrupt();
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            try {
                System.out.println("go to sleep");
                Thread.currentThread().sleep(10000);
                System.out.println("finished sleep");
            } catch (InterruptedException e) {
                System.out.println("get interrupt exception");
            }
            System.out.println("The run method is executed");
        }
    }
}
