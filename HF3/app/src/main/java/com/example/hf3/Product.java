package com.example.hf3;

public class Product {
    String code;
    String name;
    String price;

    public Product(String code, String name, String price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product[ code= " + code + ", name= " + name + ", price= ]";
    }
}
