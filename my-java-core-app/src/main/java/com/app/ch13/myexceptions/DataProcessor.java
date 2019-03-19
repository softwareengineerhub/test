package com.app.ch13.myexceptions;

import java.sql.SQLException;

public class DataProcessor {

    public void doProcess(String type){
        System.out.println(type.length());
    }

    public void doProcess2(String type) throws SQLException {
        System.out.println(type.length());
    }


    public void makeHugeAmount(){
        Object[] items = new Object[1000];
        for(int i=0;i<items.length;i++){
            items[i] = new byte[10*1024*1024];
        }
    }

    //public String doAction(String type) throws SQLException {
    public String doAction(String type) {
        try{
            int n=type.length();
            System.out.println("n="+n);
            return n+"";
        }catch(Exception ex){
            //System.out.println("Here is Exception!!!");
            //ex.printStackTrace();
            //return null;
            throw new RuntimeException(ex);
            //throw ex;
    //        throw new SQLException(ex);
            //throw new SQLException();
        }finally{
            System.out.println("Finally block{}");
        }
    }
}
