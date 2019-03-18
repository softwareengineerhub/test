package com.app.ch09.mystatic;

public class MyUtils {

    public static boolean isValid(Object obj){
       return true;
    }

    public static boolean isEmpty(String str){
        if(str==null){
            return true;
        }
        if(str.length()==0){
            return true;
        }
        if(str.trim().length()==0){
            return true;
        }
        return false;
    }

}
