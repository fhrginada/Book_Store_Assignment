public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        QuantumBookstore store = new QuantumBookstore();

        // Adding books
        store.addBook(new PaperBook("111", "Java Basics", 2020, 150.0, "Ahmed Ali", 10));
        store.addBook(new EBook("222", "Python Guide", 2019, 100.0, "Sara Mostafa", "PDF"));
        store.addBook(new ShowcaseBook("333", "C++ Demo", 2010, 0.0, "John Doe"));

        // Remove outdated books
        store.removeOutdatedBooks(10);

        // Buying books
        try {
            store.buyBook("111", 2, "user@example.com", "Cairo, Egypt");
            store.buyBook("222", 1, "user@example.com", "N/A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Trying to buy a showcase book
        try {
            store.buyBook("333", 1, "user@example.com", "N/A");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
