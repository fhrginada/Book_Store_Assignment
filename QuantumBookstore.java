/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quantumbookstorefulltest;
import java.util.*;

/**
 *
 * @author Nada
 */


public class QuantumBookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Book added - " + book.getTitle());
    }

    public void removeOutdatedBooks(int maxAge) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<String> toRemove = new ArrayList<>();

        for (Book book : inventory.values()) {
            if (currentYear - book.getPublishYear() > maxAge) {
                toRemove.add(book.getIsbn());
            }
        }

        for (String isbn : toRemove) {
            inventory.remove(isbn);
            System.out.println("Quantum book store: Removed outdated book with ISBN " + isbn);
        }
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = inventory.get(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Quantum book store: Book not found.");
        }
        if (!book.isAvailable()) {
            throw new IllegalStateException("Quantum book store: Book is not available for sale.");
        }

        book.handlePurchase(quantity, email, address);
        double total = book.getTotalPrice(quantity);
        System.out.println("Quantum book store: Purchase successful. Total paid: $" + total);
        return total;
    }
}

