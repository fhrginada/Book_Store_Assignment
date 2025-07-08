/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumbookstorefulltest;

/**
 *
 * @author Nada
 */
public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int publishYear, double price, String author) {
        super(isbn, title, publishYear, price, author);
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void handlePurchase(int quantity, String email, String address) {
        throw new UnsupportedOperationException("Quantum book store: Showcase books are not for sale.");
    }
}

