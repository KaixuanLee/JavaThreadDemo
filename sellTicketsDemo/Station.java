package sellTicketsDemo;

public class Station extends Thread {
    // Assign value to thread name by constructor
    public Station(String name) {
        super(name);// Assign thread name
    }
    // In order to keep the number of votes consistent, the number of votes should be static
    static int tick = 20;
    // Create a static key
    static Object ob = "aa";
    // Rewrite the run method to implement the ticket purchase operation
    @Override
    public void run() {
        while (tick > 0) {
            synchronized (ob) {//This is very important, a lock must be used,
                // The person who goes in will hold the key in his hand and only give the key out when he comes out
                if (tick > 0) {
                    System.out.println(getName() + "sold the " + tick + " ticket");
                    tick--;
                } else {
                    System.out.println("Tickets are sold out");
                }
            }
            try {
                sleep(1000);//sleep 1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
