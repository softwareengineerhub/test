package com.app.homework.utils;

import java.util.Random;

/**
 * Random number generator utils for providing ids for the products
 */
public class DataGeneratorUtils {

    public static int generateID(){
        Random random = new Random();
        return random.nextInt();
    }
}
