import javax.swing.*;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

// Lisää threadit ja dialogivalinnat

public class Main {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(1);

            String url = "https://statsapi.web.nhl.com/api/v1/teams";

            // Initialises timer
          //  Timer timer = new Timer();

            // Makes a new DataApi class
            DataApi dataApi = new DataApi(url);
            Menu menuClass = new Menu();
            // Makes a new thread
          //  Thread dataThread = new Thread(dataApi);
            Thread menuThread = new Thread(menuClass);

          //  dataThread.start();

            // Starts a timed thread to run on loop every minute

            TimerTask repeatedTask = new TimerTask() {

                @Override
                public void run() {
                    dataApi.run();
                    menuClass.setTeamsList(dataApi.getTeams());
                }
            };
            Timer timer = new Timer("Timer");
            long delay = 100L;
            long period = 1000L * 10L;
            timer.scheduleAtFixedRate(repeatedTask, delay, period);

/*
            while (dataThread.isAlive()) {
             //   System.out.println("Dataa haetaan...");
                try {

                    Thread.sleep(6000); // 1 min == 60 000 ms

                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            */

        // Starts a thread
        menuThread.start();

            while (menuThread.isAlive()) {
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            timer.cancel();
            timer.purge();
    }
}

