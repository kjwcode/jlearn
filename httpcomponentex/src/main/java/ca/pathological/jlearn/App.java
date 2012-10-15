package ca.pathological.jlearn;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;


public class App {
    public static void main(String[] args) throws Exception {
        HttpClient httpclient = new DefaultHttpClient();

        try {
            HttpGet httpget = new HttpGet("http://www.google.com/");
            System.out.println("executing request " + httpget.getURI());

            ResponseHandler<String> responseHandler
                    = new BasicResponseHandler();
            String responseBody = httpclient.execute(httpget, responseHandler);
            System.out.println("--------------------------------------------");
            System.out.println(responseBody);
            System.out.println("--------------------------------------------");
        }
        finally {
            httpclient.getConnectionManager().shutdown();
        }
    }
}
