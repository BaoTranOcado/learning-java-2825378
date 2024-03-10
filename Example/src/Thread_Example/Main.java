package Thread_Example;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static Object SPOON = new Object();
    public static Object BOWL = new Object();
    private static Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
/*
        Thread1 thread1 = new Thread1();
        thread1.setName("My first thread");
        thread1.start();
*/
        Thread cook1 = new Thread(() -> {
            synchronized(SPOON) {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for the bowl...");
            }
            synchronized (BOWL) {
                System.out.println("Cook1: Holding the spoon and bowl.");
            }

            File rotation4 = new File("C:\\Users\\q.baotran\\Documents\\Java Learning\\learning-java-2825378\\Example\\src\\OutputStream\\Rotation 4.txt");
            try (
                    BufferedReader reader = new BufferedReader(new FileReader(rotation4));
            ){
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                    //e.printStackTrace();
                LOGGER.log(Level.WARNING,"Error reading from file Rotation 4",e);
                }
        });

        Thread cook2 = new Thread(() -> {
            synchronized(SPOON) {
                System.out.println("Cook2: Holding the bowl...");
                System.out.println("Cook2: Waiting for the spoon...");
            }
            synchronized (BOWL) {
                System.out.println("Cook2: Holding the spoon and bowl.");
            }
            // Download file: File must be accessible without authorisation need
            try {
                //downloadFileFromURL fileFromURL1 = new downloadFileFromURL("";
                String pahHtml = "C:\\Users\\q.baotran\\Documents\\Java Learning\\learning-java-2825378\\Example\\src\\OutputStream\\WikiOutput.html";
                BufferedReader readerPahHtml = new BufferedReader(new FileReader((pahHtml)));
                String line;

                while ((line = readerPahHtml.readLine()) != null) {
                    if (line.contains(".css\"")) {
                        String[] cssArray1 = line.split("href=\"");
                        String[] cssArray2 = cssArray1[1].split("\" media");
                        String cssFileName = cssArray2[0].substring(54);
                        String cssFilePath = String.format("C:\\Users\\q.baotran\\Documents\\Java Learning\\learning-java-2825378\\Example\\src\\OutputStream\\%s",cssFileName);
                        String cssUrlToDownload = "https:" + cssArray2[0];
                        DownloadFileFromURL downloadPahCSS = new DownloadFileFromURL(cssUrlToDownload, cssFilePath);
                        downloadPahCSS.downloadFile();
                    }
                }
            } catch (IOException e) {
                LOGGER.log(Level.WARNING,"Error when downloading file",e);
            }

            String[] contents = new File(".").list();
            assert contents != null;
            for (String file : contents) {
                System.out.println(file);
            }


        });
        cook1.setName("My first cook");
        cook2.setName("My second cook");
        cook1.start();
        cook2.start();

    }
}
