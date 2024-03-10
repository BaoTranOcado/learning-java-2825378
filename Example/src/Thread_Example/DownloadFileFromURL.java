package Thread_Example;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DownloadFileFromURL {
    private static final Logger LOGGER = Logger.getLogger(DownloadFileFromURL.class.getName());
    private String outFile ; //= "C:\\Users\\q.baotran\\Documents\\Java Learning\\learning-java-2825378\\Example\\src\\OutputStream\\WikiOutput.css";
    private String inFile;
    public DownloadFileFromURL(String URLStr, String outFile) {
        this.inFile = URLStr;
        this.outFile = outFile;
    }
    public void downloadFile() {
        URI uri = null;
        try {
            uri = new URI(inFile);
            try (
                    BufferedInputStream bis = new BufferedInputStream(uri.toURL().openStream());
                    FileOutputStream fos = new FileOutputStream(outFile);
            ){
                byte[] buffer = new byte[2048];
                int count = 0;
                while ((count = bis.read(buffer, 0, 2048)) != -1) {
                    fos.write(buffer, 0, 2048);
                    buffer = new byte[2048];
                }
            }
            catch (IOException e) {
                LOGGER.log(Level.WARNING,"Exception when downloading html");
            }

        } catch (URISyntaxException e) {
            String message = String.format("Exception when importing URL %s", inFile);
            LOGGER.log(Level.WARNING, message);
        }

    }
}
