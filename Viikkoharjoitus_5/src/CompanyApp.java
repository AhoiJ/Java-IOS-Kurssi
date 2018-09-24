

public class CompanyApp {
    public static void main(String[] args){
        String url = "https://home.tamk.fi/~poypek/iosapi1/index.php/employees";
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
