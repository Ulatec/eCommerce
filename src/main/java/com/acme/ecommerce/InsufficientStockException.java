package com.acme.ecommerce;




public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException() {
        super("Insufficient stock available.");
    }
}
