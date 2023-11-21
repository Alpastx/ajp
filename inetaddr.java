// WAP to demonstrate the use of InetAddress class and its factory methods

import java.net.*;

public class inetaddr {
    public static void main(String[] args) throws UnknownHostException{

        InetAddress localAddress = InetAddress.getLocalHost();

        System.out.println("Local Host Name: " + localAddress.getHostName());
        System.out.println("Local Host address: " + localAddress.getHostAddress());

        String website = "www.youtube.com";
        
        InetAddress address = InetAddress.getByName(website);
        System.out.println("Website Name: " + website);
        System.out.println("Host Name: " + address.getHostName());
        System.out.println("Host address: " + address.getHostAddress());

        InetAddress[] addresses = InetAddress.getAllByName(website);
        System.out.println("Website Name: " + website);
        for (int i = 0; i < addresses.length; i++){
            System.out.println("Host Name: " + addresses[i].getHostName());
            System.out.println("Host address: " + addresses[i].getHostAddress());
        }
    }
}