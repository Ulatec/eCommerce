package com.acme.ecommerce;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException() {
        super("Product not found.");
    }
}
