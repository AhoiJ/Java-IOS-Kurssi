import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

class Response{
    List <Employee> data;
}

public class DataApi implements Runnable{
    String url;
    DataApi(String url){
        this.url = url;
    }

    @Override
    public void run(){
        try {
            HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            //System.out.println("Yhteys on saatu");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String input;
            while ((input = bufferedReader.readLine()) != null){
                stringBuilder.append(input);
            }
            bufferedReader.close();
            connection.disconnect();
            System.out.println(stringBuilder.toString());

            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(stringBuilder.toString()).getAsJsonObject();
            Employee[] employees = new Gson().fromJson(jsonObject.get("data"), Employee[].class);
           // ArrayList<Employee> emps = new ArrayList<Employee>();
           // List<Employee> list = new Gson().fromJson(jsonObject.get("data"), emps.getClass());
           // System.out.println(jsonObject.get("data"));

            for (Employee e: employees){
                System.out.println(e.getFname() + " " + e.getLname());
            }
        /*
            for (Object e: list){
                System.out.println(e.);
            }
        */
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }

}
