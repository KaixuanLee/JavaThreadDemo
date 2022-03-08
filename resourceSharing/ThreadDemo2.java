package resourceSharing;

public class ThreadDemo2 {

    public static void main(String[] args) {
        HelloThread2 t = new HelloThread2();
        Thread thread1 = new Thread(t, "Window 1 : ");
        thread1.start();
        Thread thread2 = new Thread(t, "Window 2 : ");
        thread2.start();
    }
}

class HelloThread2 implements Runnable{
    private int ticket = 5;
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+(ticket--));
            if (ticket<1) {
                break;
            }
        }
    }
}