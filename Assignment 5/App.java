import java.net.URL;
import java.net.URLEncoder;
import javax.management.RuntimeErrorException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class App {

    static final String ClientID = "02bd74568caf4b5c90886f2cc333213d";
    static final String ClientSecret = "2025fbded9cb4aef809c1a6ef5dd2749";
    static final String RedirectURL = "https://accounts.spotify.com/authorize";

    public static void main( String[] args) throws Exception{

        /* Connection to the Spotify API. You need a Spotify API token.
            You can get one from Spotify's website. */ 

        try{
            URL url = new URL("https://accounts.spotify.com/api/token?grant_type=client_credentials");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");

            if (connection.getResponseCode() != 200){ throw new RuntimeException("Connection failed. Error Code: " + connection.getResponseCode()); }

            BufferedReader br = new BufferedReader(new InputStreamReader((connection.getInputStream())));

            String output;

            System.out.println("Output from Spotify ... \n");

            while((output = br.readLine()) !=null){
                System.out.println(output);
            }
            connection.disconnect();
        } catch(IOException e){ e.printStackTrace();}

    }
    

}