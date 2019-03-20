package com.app.homework;

import com.app.homework.enums.ProductType;
import com.app.homework.utils.DataGeneratorUtils;

public abstract class Product {

    private int id;
    private int weight;
    private int height;
    private ProductType productType;

    public Product(){
        this.id = DataGeneratorUtils.generateID();
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public abstract void on();
    public abstract void off();

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    protected int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void buy(){
        System.out.println("Product: " + toString() + " - bought");
    }

    public void sale(){
        System.out.println("Product: " + toString() + " - sold");
    }

    @Override
    public String toString(){
        return String.format("Product: id=%s, weight=%s, height=%s", id, weight, height);
    }

}
