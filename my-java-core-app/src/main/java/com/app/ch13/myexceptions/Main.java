package com.app.ch13.myexceptions;


/*
                                            Throwable

                            Error                           Exception
                                                        RuntimeException(Unchecked)        CompileTime (Checked)


 */

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor();
        String type = "asdsafsa";
        dataProcessor.doProcess(type);

        try {
            dataProcessor.doProcess2(type);

            dataProcessor.makeHugeAmount();
        } catch (SQLException e) {
            System.out.println("Here in SQLException");
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println("Here in NullPointerException");
            e.printStackTrace();
        } catch (RuntimeException e){
            System.out.println("Here in NullPointerException");
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Here in Exception");
            e.printStackTrace();
        } catch (Error e){
            System.out.println("Here in Error");
            e.printStackTrace();
        }catch (Throwable th){
            System.out.println("Here in Throwable");
            th.printStackTrace();
        }finally{
            System.out.println("Finally");
        }


        System.out.println("Finish");
        System.out.println("------------------");
        /*try {
            dataProcessor.doAction(null);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        dataProcessor.doAction(null);



    }
}
