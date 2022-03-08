package rabbitAndTortoise;

public class Rabbit extends Animal {

    public Rabbit() {
        setName("rabbit");
    }

    @Override
    public void runing() throws InterruptedException {
        int dis = 5;
        length -= dis;
        System.out.println("rabbit ran " + dis + "meters, there are still" + length + "meters");
        if (length <= 0) {
            length = 0;
            System.out.println("Rabbit wins");
            if (calltoback != null) {
                calltoback.win();
            }
        }
        try {
            if ((200 - length) % 20 == 0) {
                sleep(15000); //sleep 15s
            } else {
                sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
