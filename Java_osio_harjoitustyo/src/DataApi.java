import com.google.gson.Gson;
import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.List;


class Response {
    List<Team> teams;
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
                HttpsURLConnection connection = (HttpsURLConnection) new URL(this.url)
                        .openConnection(); // opens connection to site
                connection.setRequestMethod("GET"); // defines connection type
                System.out.println("Data retrieved"); // tells when connection works

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                String input;

                while ((input = bufferedReader.readLine()) != null) {
                    stringBuilder.append(input);
                }
                bufferedReader.close();
                connection.disconnect();

                this.dataStr_ = stringBuilder.toString();

            } catch (IOException ex) {
                System.out.println(ex);
            }

    }
    public List<Team> getTeams() {
            Gson gson = new Gson();
            Response response = gson.fromJson(this.dataStr_, Response.class);
            return response.teams;
    }

}



