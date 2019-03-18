package com.app.ch06.myenum;

public enum MoneyType {
    UA_TYPE(), UK_TYPE("GBP-default"), USD_TYPE;

    private String value;

    static{
        System.out.println("ENUM static{}");
    }

    {
        System.out.println("ENUM {}");

    }

    private MoneyType(){

    }

    MoneyType(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public static MoneyType fromString(String value){
        if("GBP-default".equals(value)){
            return UK_TYPE;
        }
        if("UA_TYPE".equals(value)){
            return UA_TYPE;
        }
        if("USD_TYPE".equals(value)){
            return USD_TYPE;
        }
        return null;
    }
}
