/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumbookstorefulltest;

/**
 *
 * @author Nada
 */
public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int publishYear, double price, String author, String fileType) {
        super(isbn, title, publishYear, price, author);
        this.fileType = fileType;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public void handlePurchase(int quantity, String email, String address) {
        System.out.println("Quantum book store: Sending " + title + " to " + email + " via MailService.");
    }
}

