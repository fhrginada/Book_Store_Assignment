/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumbookstorefulltest;

/**
 *
 * @author Nada
 */
public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int publishYear, double price, String author, int stock) {
        super(isbn, title, publishYear, price, author);
        this.stock = stock;
    }

    @Override
    public boolean isAvailable() {
        return stock > 0;
    }

    @Override
    public void handlePurchase(int quantity, String email, String address) {
        if (stock < quantity) {
            throw new IllegalArgumentException("Quantum book store: Not enough stock for paper book.");
        }
        stock -= quantity;
        System.out.println("Quantum book store: Sending " + title + " to " + address + " via ShippingService.");
    }
}

