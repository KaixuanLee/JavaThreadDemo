package sellTicketsDemo;

public class MainClass {
    /**
     * Example: Three ticket windows selling 10 tickets at the same time
     * */
    public static void main(String[] args) {
        //Instantiate station objects and give each station a name
        Station station1=new Station("window 1 ");
        Station station2=new Station("window 2 ");
        Station station3=new Station("window 3 ");
        // Make each station object work individually
        station1.start();
        station2.start();
        station3.start();
    }
}
