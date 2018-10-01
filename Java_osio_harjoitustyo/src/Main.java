
    public class Main {
        public static void main(String[] args){
            String url = "https://rata.digitraffic.fi/api/v1/live-trains/station/HKI";
            DataApi dataApi = new DataApi(url);
            Thread dataThread = new Thread(dataApi);
            dataThread.start();
            while (dataThread.isAlive()){
                System.out.println("Dataa haetaan...");
                try{
                    Thread.sleep(200);
                }
                catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }

            }
        }
    }


