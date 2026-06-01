package com.parent;
import java.util.Map;

import com.google.gson.Gson;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Gson gson = new Gson(); 
        System.out.println(gson.toJson(Map.of("message", "working fine")));
    }
}
