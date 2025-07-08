/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quantumbookstorefulltest;

/**
 *
 * @author Nada
 */

public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        
        store.addBook(new PaperBook("1", "Java Basics", 2020, 150.0, "Ahmed Ali", 10));
        store.addBook(new EBook("2", "Python Guide", 2019, 100.0, "Sara Mostafa", "PDF"));
        store.addBook(new ShowcaseBook("3", "C++ Demo", 2010, 0.0, "Nada Hassan"));

        
        store.removeOutdatedBooks(10);

        
        try {
            store.buyBook("111", 2, "user@example.com", "Cairo, Egypt");
            store.buyBook("222", 1, "user@example.com", "N/A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        try {
            store.buyBook("333", 1, "user@example.com", "N/A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
