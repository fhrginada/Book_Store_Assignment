
#  Quantum Bookstore – Java OOP Assignment

This is a basic simulation of an online bookstore built in Java using Object-Oriented Programming principles. The project was completed as part of an internship coding challenge for **Fawry Integrated Systems**.

---

##  Overview

The **Quantum Bookstore** supports the management and sale of three types of books:

- ** PaperBook** – Can be purchased and shipped (with stock).
- ** EBook** – Can be purchased and sent by email.
- ** ShowcaseBook** – Demo books not available for sale.

Each action printed to the console starts with:

Quantum book store:

---

##  Features

- Add books (with `ISBN`, `title`, `year`, `price`, `author`).
- Remove outdated books (older than a specific number of years).
- Buy books by ISBN with quantity, email, and address.
  - Decrease quantity for paper books.
  - Return total price paid.
  - Simulate sending via `ShippingService` or `MailService`.
- ShowcaseBooks cannot be purchased.

---

##  OOP Concepts Used

- **Abstraction** – Base class `Book` defines common behavior.
- **Inheritance** – `PaperBook`, `EBook`, and `ShowcaseBook` extend `Book`.
- **Polymorphism** – Buying any book handled through a common interface.
- **Encapsulation** – Book details and logic are kept inside each class.

---

##  Project Structure

QuantumBookstore/
├── Book.java
├── PaperBook.java
├── EBook.java
├── ShowcaseBook.java
├── QuantumBookstore.java
└── QuantumBookstoreFullTest.java


---

##  How to Run

1. Compile all `.java` files:
   ```bash
   javac *.java

2.run the test class: java QuantumBookstoreFullTest

----

## Notes
This project is designed to be easily extensible. Adding a new book type or product will not require changes to existing logic.

ShippingService and MailService are only simulated using print statements.

----


## Author
Nada – 3nd Year Computer Science Student
Intership Assignment- Fawry Rise Journy

