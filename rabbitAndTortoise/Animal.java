package rabbitAndTortoise;

public abstract class Animal extends Thread {
    public int length = 200;

    public abstract void runing() throws InterruptedException;

    @Override
    public void run() {
        super.run();
        while (length > 0) {
            try {
                runing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static interface Calltoback {
        public void win() throws InterruptedException;
    }

    public Calltoback calltoback;

}
