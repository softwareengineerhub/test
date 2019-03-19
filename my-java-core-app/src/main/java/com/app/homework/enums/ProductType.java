package com.app.homework.enums;

public enum ProductType {

    ELECTRONICS("ID01"),
    MEAL("ID02"),
    WEAR("ID03"),
    CHEMICALS("ID04");

    private String productType;

    private ProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    /**
     * Convert string value to ProductType
     * @param value ID of the product type
     * @return ProductType
     */

    public static ProductType fromString(String value){
        if(value.equalsIgnoreCase("ID01")){
            return ELECTRONICS;
        }
        if(value.equalsIgnoreCase("ID02")){
            return MEAL;
        }
        if(value.equalsIgnoreCase("ID03")){
            return WEAR;
        }
        if(value.equalsIgnoreCase("ID04")){
            return CHEMICALS;
        }
        return null;
    }
}
