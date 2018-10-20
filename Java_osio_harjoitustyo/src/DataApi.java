import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class DataApi implements Runnable{
    String url;
    DataApi(String url){
        this.url = url;
    }


    @Override
    public void run() {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
             System.out.println("Yhteys on saatu");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String input;

            while ((input = bufferedReader.readLine()) != null){
                 stringBuilder.append(input);
            }
            bufferedReader.close();
            connection.disconnect();
          //  System.out.println(stringBuilder.toString());

           // JsonObject obj = new JsonObject(stringBuilder.substring(stringBuilder.indexOf('{')));

            JsonParser parser = new JsonParser();
           JsonArray jsonArray = parser.parse(stringBuilder.toString()).getAsJsonArray();


         //   JsonObject jsonObject = parser.parse(stringBuilder.toString()).getAsJsonObject();
            Trains[] trains = new Gson().fromJson(jsonArray, Trains[].class);

            for (Trains e: trains) {
                System.out.println(" Train number: " + e.getTrainNumber() + " departure date: " + e.getdepartudeDate());
            }

        } catch(IOException ex){
            System.out.println(ex);
        }

    }
}



