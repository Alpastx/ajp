// WAP to demonstrate the use of URL and URLConnection class and its methods

import java.net.*;

public class urlconn {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.google.com/");
            URLConnection urlConnection = url.openConnection();

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("Path: " + url.getPath());

            System.out.println("Content Type: " + urlConnection.getContentType());
            System.out.println("Content: " + urlConnection.getContent());
            System.out.println("Content Length: " + urlConnection.getContentLength());
            System.out.println("Date: " + urlConnection.getDate());
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
