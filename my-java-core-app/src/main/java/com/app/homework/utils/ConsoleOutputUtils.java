package main.java.com.app.homework.utils;

/**
 * utils to provide usable methods for output messages to console
 */
public class ConsoleOutputUtils {

    public static void print(String message){
        if(message == null){
            throw new NullPointerException("message should not be null");
        }
        System.out.println(message);
    }
}
