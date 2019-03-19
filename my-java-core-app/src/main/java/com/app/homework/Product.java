package main.java.com.app.homework;

import main.java.com.app.homework.enums.ProductType;
import main.java.com.app.homework.utils.DataGeneratorUtils;

public class Product {

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

    protected void setProductType(ProductType productType) {
        this.productType = productType;
    }

    protected int getId() {
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

    protected void setHeight(int height) {
        this.height = height;
    }

    protected void buy(){
        System.out.println("Product: " + toString() + " - bought");
    }

    protected void sale(){
        System.out.println("Product: " + toString() + " - sold");
    }

    @Override
    public String toString(){
        return String.format("Product: id=%s, weight=%s, height=%s", id, weight, height);
    }

}
