public abstract class Book {
    protected String isbn;
    protected String title;
    protected int publishYear;
    protected double price;
    protected String author;

    public Book(String isbn, String title, int publishYear, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public abstract boolean isAvailable();

    public abstract void handlePurchase(int quantity, String email, String address);

    public double getTotalPrice(int quantity) {
        return price * quantity;
    }

    public String getTitle() {
        return title;
    }
}
