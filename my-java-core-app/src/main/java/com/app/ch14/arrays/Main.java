package com.app.ch14.arrays;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {
        Object[] data = new Object[10];
        //[null,null,null,null,null,...]
        for(int i=0;i<data.length;i++){
            Object item = data[i];
            System.out.println(item);
            System.out.println(data[i]);
        }
        System.out.println();
        int[] data2 = {0,1,2,3,4,5,6,7,8,9};
        int[] data3 = new int[10];

        for(int i=0;i<data3.length;i++){
            data3[i] = i;
        }

        System.out.println("data2.equals(data3): "+(data2.equals(data3)));
        System.out.println("data2==data3: "+(data2==data3));
        System.out.println("data2.hashCode: "+(data2.hashCode()));
        System.out.println("data3.hashCode: "+data3.hashCode());
        System.out.println("data2: "+data2);
        System.out.println("data3: "+data3);
        System.out.println("-------------ARRAYS-------------");
        System.out.println("data2.equals(data3): "+Arrays.equals(data2,data3));
        System.out.println("data2==data3: "+(data2==data3));
        System.out.println("data2.hashCode: "+Arrays.hashCode(data2));
        System.out.println("data3.hashCode: "+Arrays.hashCode(data3));
        System.out.println("data2: "+Arrays.toString(data2));
        System.out.println("data3: "+Arrays.toString(data3));
        System.out.println("---------------------------------");

        Cup[] cups = new Cup[3];
        cups[0] = new Cup();
        cups[1] = new CupChild();
        cups[2] = new CubSubChild();


        CupChild[] cupChildren = new CupChild[3];
        //cupChildren[0] = new Cup();
        cupChildren[1] = new CupChild();
        cupChildren[2] = new CubSubChild();

        CubSubChild[] cubSubChildren = new CubSubChild[3];
        //cupChildren[0] = new Cup();
        //cubSubChildren[1] = new CupChild();
        cubSubChildren[2] = new CubSubChild();


        Cup[] cups2 = new CupChild[3];
        Cup[] cups3 = new CubSubChild[3];
        CupChild[] cups4 = new CubSubChild[3];
        //----------------------------
        Cup[] items = new Cup[3];
        items[0] = new Cup();
        items[1] = new CupChild();
        items[1] = new CubSubChild();

        for(int i=0;i<items.length;i++){
            Cup item = items[i];
            if(item.getClass()==CupChild.class){
                CupChild cupChild = (CupChild) item;
            }
        }

        for(Cup cup: items){
            System.out.println(cup);
        }


    }
}
