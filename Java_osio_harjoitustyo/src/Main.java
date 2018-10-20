import javax.swing.*;

public class Main {
        public static void main(String[] args){
            String url = "https://rata.digitraffic.fi/api/v1/live-trains/station/HKI";
            DataApi dataApi = new DataApi(url);
            Thread dataThread = new Thread(dataApi);
            dataThread.start();
            while (dataThread.isAlive()) {
                // System.out.println("Dataa haetaan...");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

            }
            // dialogChoise
            String choise;
            do {
                choise = JOptionPane.showInputDialog(null, "1. Tulosta data \n" +
                        " 2. Poista data \n 3. Poistu sovelluksesta");

                if (choise.equals("1")) {

                }
                if (choise.equals("2")){



                }
            }while (!choise.equals("3"));
        }
    }


