package nyc.c4q.m47bell;

import java.net.URL;
/**
 * Created by c4q-marbella on 3/22/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class UrlExample {
    public static void main(String[] args){
       // URL url= HTTP.stringToURL("http://alexsamuel.net");

        //System.out.println(url.getHost());

      URL newUrl2 = makeHttpUrl("github.com",80,"accesscode");
        System.out.println(newUrl2);


    }
    //a method that constructs an HTTP URL
    // from the host name, port number, and path. Include the port number only if it is not 80.
    public static URL makeHttpUrl(String host, int port, String path) {
        String newPort =":" + Integer.toString(port);
        String result= "http://"+ host + newPort + "/" + path;


       URL newUrl = HTTP.stringToURL(result);


        return newUrl ;
    }



}
