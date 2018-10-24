import javax.swing.*;
import java.util.List;

// Lisää threadit ja dialogivalinnat

public class Main {
        public static void main(String[] args){
            String url = "https://statsapi.web.nhl.com/api/v1/teams";
            List<Teams> teamsList;

            // Makes a new DataApi class
            DataApi dataApi = new DataApi(url);

            // Makes a new thread
            Thread dataThread = new Thread(dataApi);

            // Starts a thread

            dataThread.start();

            while (dataThread.isAlive()) {
                System.out.println("Dataa haetaan...");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }


            teamsList = dataApi.getTeams();

            Menu menuClass = new Menu(teamsList);

            Thread menuThread = new Thread (menuClass);

            menuThread.start();

            while (menuThread.isAlive()) {
                System.out.println("Jou jou jou ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }


