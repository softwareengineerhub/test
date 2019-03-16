package com.app.ch04.javabean;

public class Device {
    private String name;
    private int price;
    private int year;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        String res = String.format("name:%s; price:%s; year:%s", name, price, year);
        //String res2 = "name:"+name+"; price:"+price+"; year="+year;
        return res;
    }
}
