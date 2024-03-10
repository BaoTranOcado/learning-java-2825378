package OOP_Training;

import OOP_Training.Model.*;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import javax.xml.crypto.Data;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.*;
import java.net.http.*;
import java.util.logging.*;

import static java.net.http.HttpClient.newHttpClient;

public class Main {
    private static Logger LOGGER = Logger.getLogger(Thread_Example.Main.class.getName());
    public static void main(String[] args) {
        ClothingItem tShirt = new Shirt("M", 23.5); //upcasting to superclass
        System.out.println(tShirt);
        String jsonURL = "https://services.hanselandpetal.com/feeds/flowers.json";
        String outJsonPath = "C:\\Users\\q.baotran\\Documents\\Java Learning\\learning-java-2825378\\Example\\src\\OutputStream\\Json_Example.json";
        String outJson = "C:\\Users\\q.baotran\\Documents\\Java Learning\\learning-java-2825378\\Example\\src\\OutputStream\\Flower.json";
        String outJsonviaGson = "C:\\Users\\q.baotran\\Documents\\Java Learning\\learning-java-2825378\\Example\\src\\OutputStream\\FlowerGson.json";
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
        /*
        DownloadFileFromURL downloadJson = new DownloadFileFromURL(jsonURL, outJsonPath);
        downloadJson.downloadFile();

        try (
                JsonReader jR = new JsonReader(new FileReader(outJsonPath));
                ) {
            Flower[] data = gson.fromJson(jR, Flower[].class); // Create Data class to be translated
            for (Flower flower1 : data) {
                System.out.println(flower1.toJsonString());
            }

            JsonWriter jW = new JsonWriter(new FileWriter(outJson));
            jW.beginArray();
            for (Flower flower2 : data) {
                jW.jsonValue(flower2.toJsonString());
            }
            jW.endArray();
        } catch (IOException e) {
            LOGGER.log(Level.WARNING,"Error downloading JSON file",e);
        }
*/
        HttpClient client = null;
        try {
            client = newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(new URI(jsonURL)).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.headers());
            System.out.println(response.body());
        } catch (URISyntaxException e) {
            LOGGER.log(Level.WARNING, "Error downloading JSON file", e);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        client.close();

        /*
        try {
            while (true) {
                float newUserIn = NewInput.readNum();
                Operation newOps = NewInput.readOperation();

                MathHelper addNum = new MathHelper(newUserIn, newOps);
                addNum.getTotal();
            }
        } catch (NumberFormatException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, "Number format error occurred when receiving input");
            System.out.println("All done!");
        }*/
    }
}