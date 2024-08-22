package edu.escuelaing.arem.ASE.app;


import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Map<String, Service> services = new HashMap();

    public static void main( String[] args )
    {
        get("/hello", (req, resp) -> "Hello " + req);
        get("/pi", (req, resp) -> {
            return String.valueOf(Math.PI);
        });
        String requestedUrl = "/app/hello?name=Prueba1";
        System.out.println(services.get("/pi").getValue("", ""));
        System.out.println(services.get("/hello").getValue("", ""));

    }
    public static void get(String url, Service s){
        services.put(url,s);
    }
}
