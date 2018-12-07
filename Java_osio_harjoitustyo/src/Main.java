import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

            String url = "https://statsapi.web.nhl.com/api/v1/teams"; // the url where program gets its data

            // Makes a new DataApi and Menu class
            DataApi dataApi = new DataApi(url); // new DataApi (url) sets url value to dataApi
            Menu menuClass = new Menu();

            // Makes a new thread
            Thread menuThread = new Thread(menuClass);


            // Starts a timed thread to run on loop every minute
            TimerTask repeatedTask = new TimerTask() {
                @Override
                public void run() {
                    dataApi.run(); // starts dataApi function
                    menuClass.setTeamsList(dataApi.getTeams()); // inserts retrieved data to Menu class teams list
                }
            };
            Timer timer = new Timer("Timer");
            long delay = 1000L;
            long period = 1000L * 60L; // sets to repeat every minute
            timer.scheduleAtFixedRate(repeatedTask, delay, period); // calls the function above


        // Starts a thread
        menuThread.start();
                // Stops the program from stopping until menuThread has finished
            while (menuThread.isAlive()) {
                try {
                    Thread.sleep(2000);

                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
            // Terminates the timer thread
            timer.cancel();
            timer.purge();
    }
}

