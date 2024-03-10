package OOP_Training;

import java.net.http.HttpClient;


public class JSONProcessor {
    private final String dataURL;

    public JSONProcessor(String dataURL) {
        this.dataURL = dataURL;
    }
    public void httpClient () {
        try (HttpClient client = HttpClient.newHttpClient()) {

        }
    }
}
