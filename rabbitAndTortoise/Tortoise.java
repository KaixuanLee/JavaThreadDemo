package rabbitAndTortoise;

public class Tortoise extends Animal {
    public Tortoise() {
        setName("turtle");
    }

    @Override
    public void runing() throws InterruptedException {
        // 乌龟速度
        int dis = 2;
        length -= dis;
        System.out.println("turtle run " + dis + "meters, there are still" + length + "meters");
        if (length <= 0) {
            length = 0;
            System.out.println("turtle wins");
            if (calltoback != null) {
                calltoback.win();
            }
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
