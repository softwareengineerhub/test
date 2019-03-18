package com.app.ch06.myenum;

public class Main {

    public static final String UA = "GRN";
    public static final String UK = "GBP";
    public static final String USD = "USD";

    public static void main(String[] args) {
        String value = "";
        switch(value){
            case UA:
                System.out.println("ua");
                break;
            case USD:
                System.out.println("usd");
                break;
            case UK:
                System.out.println("uk");
                break;
        }
        System.out.println("-------------------");
        MoneyType moneyType = MoneyType.USD_TYPE;

        switch (moneyType){
            case UA_TYPE:
                System.out.println("ua_TYPE");
                break;
            case USD_TYPE:
                System.out.println("ua_TYPE");
                break;
            case UK_TYPE:
                System.out.println("ua_TYPE");
                break;
        }

        System.out.println("----------values-------------");
        MoneyType[] values=MoneyType.values();
        for(MoneyType moneyType1: values){
            System.out.println(moneyType1.getValue());
        }

        System.out.println("----------values-------------");
        String name = MoneyType.USD_TYPE.name();
        System.out.println("MoneyType.USD_TYPE.name()="+name);
        int ordinal = MoneyType.USD_TYPE.ordinal();
        System.out.println("MoneyType.USD_TYPE.ordinal="+ordinal);

        System.out.println("----------Creat enum from String---------------");
        String tmpVal = "GBP-default";
        //MoneyType moneyType2 = MoneyType.valueOf(tmpVal);
        MoneyType moneyType2 = MoneyType.valueOf("UK_TYPE");
        System.out.println(moneyType2);

        MoneyType moneyType3 = MoneyType.fromString(tmpVal);
        System.out.println(moneyType3);
    }
}
