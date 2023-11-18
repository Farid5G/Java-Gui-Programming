// 18. Write a program using URL class to retrieve the host, protocol, port and file of URL
// http://www.msbte.org.in
import java.net.*;
public class ques6 {
    public static void main(String args[]) throws MalformedURLException
    {
        URL hp = new URL("http://www.msbte.org.in");
        System.out.print("Protocol: " + hp.getProtocol());
        System.out.print("Port: " + hp.getPort());
        System.out.print("File: " + hp.getFile());
        System.out.print("Host: " + hp.getHost());
    }
}
