public class JoinDemo {

    public static void main(String[] args) {
        System.out.println("current thread: "+Thread.currentThread().getName());
        JoinDemo test = new JoinDemo();
        MyThread thread1 = test.new MyThread();
        thread1.start();
        try {
            System.out.println("Thread: "+Thread.currentThread().getName()+" waiting");
            thread1.join();
            System.out.println("Thread: "+Thread.currentThread().getName()+" continue");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("current thread: "+Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(5000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("thread: "+Thread.currentThread().getName()+" finished");
        }
    }
}

