import com.google.gson.Gson;
import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.List;

class Response {
    List<Team> teams;
}

public class DataApi implements Runnable{

    String url; // initialize variable
    String dataStr_; // initialize variable

    DataApi(String url){
        this.url = url;
    } // sets url from Main class

    @Override
    public void run() {

            try {
                HttpsURLConnection connection = (HttpsURLConnection) new URL(this.url)
                        .openConnection(); // opens connection to site
                connection.setRequestMethod("GET"); // defines connection type
                System.out.println("Data retrieved"); // tells when connection works

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream())); // creates buffered reader
                // to read data from connected api
                StringBuilder stringBuilder = new StringBuilder(); // creates new string builder
                String input; // initialize variable

                // while loop pushes input to stringbuilder
                while ((input = bufferedReader.readLine()) != null) {
                    stringBuilder.append(input);
                }
                bufferedReader.close();
                connection.disconnect();

                this.dataStr_ = stringBuilder.toString(); // sets dataStr_ value to be same as stringbuilder

            } catch (IOException ex) {
                System.out.println(ex);
            }

    }
    public List<Team> getTeams() {
            Gson gson = new Gson(); // initialize variable
            Response response = gson.fromJson(this.dataStr_, Response.class); // sets response to be gson of dataStr_
            return response.teams; // returns result
    }
}



