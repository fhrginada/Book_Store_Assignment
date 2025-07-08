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
