import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Response {
    List<Teams> data;
}


public class DataApi implements Runnable{
    String url;
    String dataStr_;
    DataApi(String url){
        this.url = url;
    }

    @Override
    public void run() {

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection(); // opens connection to site
            connection.setRequestMethod("GET"); // defines connection type
            System.out.println("Yhteys on saatu"); // tells when connection works

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String input;

            while ((input = bufferedReader.readLine()) != null){
                 stringBuilder.append(input);
            }
            bufferedReader.close();
            connection.disconnect();

            this.dataStr_ = stringBuilder.toString();
            System.out.println(this.dataStr_);


             // JsonParser parser = new JsonParser();
            // JsonArray jsonArray = parser.parse(stringBuilder.toString()).getAsJsonArray();



         //   Trains[] trains = new Gson().fromJson(jsonArray, Trains[].class);


        } catch(IOException ex){
            System.out.println(ex);
        }

    }
    public List<Teams> getTeams() {
        Gson gson = new Gson();
        Response response = gson.fromJson(this.dataStr_, Response.class);
        return response.data;
    }
}



