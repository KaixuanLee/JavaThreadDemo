package resourceSharing;

public class ThreadDemo {

    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        t1.setName("Window 1 : ");
        t1.start();
        HelloThread t2 = new HelloThread();
        t2.setName("Window 2 : ");
        t2.start();
    }
}

class HelloThread extends Thread{
    private int ticket = 5;
    public void run() {
        while(true){
            System.out.println(this.getName()+(ticket--));
            if (ticket<1) {
                break;
            }
        }
    }
}
