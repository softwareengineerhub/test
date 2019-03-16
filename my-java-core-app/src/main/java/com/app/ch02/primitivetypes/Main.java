package com.app.ch02.primitivetypes;

public class Main {

    public static void main(String[] args) {
        //byteExample();
        //shortExample();
        //intExample();
        //longExample();
        //doubleExample();
        //booleanExample();
        //charExample();
        stringExample();

    }

    private static void stringExample(){
        String s = "wfsdadfsd";
        System.out.println(s);
    }


    private static void charExample(){
        char c = ' ';
        c = '1';
        c = 't';

        int t = c;
        System.out.println("int t="+t);
        System.out.println("char c="+c);

        char c2 = (char) t;
        System.out.println("char c2="+c2);
        Character a = new Character('a');
        Character a1 = 'a';
    }

    private static void booleanExample(){
        boolean b = false;
        b = Boolean.FALSE;

        Boolean b2 = new Boolean(true);
        Boolean b3 = new Boolean(Boolean.TRUE);
        Boolean b4 = new Boolean("true");
        Boolean b5 = new Boolean("tRue");
        Boolean b6 = new Boolean("TRUE");
        Boolean b7 = new Boolean("dhfghfghbd");
        System.out.println("b2="+b2);
        System.out.println("b3="+b3);
        System.out.println("b4="+b4);
        System.out.println("b5="+b5);
        System.out.println("b6="+b6);
        System.out.println("b7="+b7);
    }



    private static void doubleExample(){
        //[-2^64/2; 2^64/2-1]
        //Double.MAX_VALUE;
        //Double.MIN_VALUE

        double a = 1.0f;
        double a1 = 1.0;
        double b = 2;
        double res = a+b;

        a = a+1;
        a +=1;
        a++;
        ++a;

        a = a-1;
        a -=1;
        a--;
        --a;

        a = a*1;
        a *=1;

        a = a/1;
        a /=1;

        //Integer w = 10;
        //Double w0 = 10.01;


        Double w1 = new Double(1);


        double c = 1;
        System.out.println(c++);
        System.out.println(c);
        System.out.println("------------");
        double d = 1;
        System.out.println(++d);
        System.out.println(d);
    }


    private static void floatExample(){
        //[-2^32/2; 2^32/2-1]
        //Float.MAX_VALUE;
        //Float.MIN_VALUE
        //double a = 1.0;
        float a = 1.0f;
        float a1 = (float)1.0;
        float b = 2;
        float res = a+b;

        a = a+1;
        a +=1;
        a++;
        ++a;

        a = a-1;
        a -=1;
        a--;
        --a;

        a = a*1;
        a *=1;

        a = a/1;
        a /=1;

        //Integer w = 10;
        //Double w0 = 10.01;


        Float w1 = new Float(1);


        float c = 1;
        System.out.println(c++);
        System.out.println(c);
        System.out.println("------------");
        float d = 1;
        System.out.println(++d);
        System.out.println(d);
    }

    private static void longExample(){
        //[-2^64/2; 2^64/2-1]
        //Long.MAX_VALUE;
        //Long.MIN_VALUE;
        long a = 1;
        long b = 2;
        long res = a+b;

        a = a+1;
        a +=1;
        a++;
        ++a;

        a = a-1;
        a -=1;
        a--;
        --a;

        a = a*1;
        a *=1;

        a = a/1;
        a /=1;


        //Long w0 = 1;
        Long w = 1L;
        Long w1 = (long)1;
        Long w2 = new Long(1);

        long c = 1;
        System.out.println(c++);
        System.out.println(c);
        System.out.println("------------");
        long d = 1;
        System.out.println(++d);
        System.out.println(d);



    }

    private static void intExample(){
        //[-2^32/2; 2^32/2-1]
        //Integer.MAX_VALUE;
        //Integer.MIN_VALUE
        int a = 1;
        int b = 2;
        int res = a+b;

        a = a+1;
        a +=1;
        a++;
        ++a;

        a = a-1;
        a -=1;
        a--;
        --a;

        a = a*1;
        a *=1;

        a = a/1;
        a /=1;

        Integer w = 1;
        Integer w1 = new Integer(1);


        int c = 1;
        System.out.println(c++);
        System.out.println(c);
        System.out.println("------------");
        int d = 1;
        System.out.println(++d);
        System.out.println(d);



    }

    private static void shortExample(){
        //[-2^16/2; 2^16/2-1]=[-32768, 32767]
        //Short.MIN_VALUE;
        //Short.MAX_VALUE;
        short s1 = 1;
        short s2 = 32767;
        s2=(short)(s2+s1);
        Short s3 = new Short(s1);
        Short s4 = 10;
        short s5 = 11;
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }

    private static void byteExample(){
        //[-2^8/2; 2^8/2-1]=[-128, 127]
        byte b1 = 127;
        b1=(byte)(b1+1000);
        System.out.println(b1);
        byte b2 = 4;
        byte resByte = (byte)(b1+b2);
        System.out.println(resByte);
        byte maxB=Byte.MAX_VALUE;
        byte minB=Byte.MIN_VALUE;

        Byte b4 = 1;
        Byte b5 = new Byte(b4);
        byte b6 = 2;
        //b5.hashCode();
    }
}
