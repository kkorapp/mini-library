public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", 328, true);
        Book book2 = new Book("Clean Code", "Robert Martin", 450, true);
        Book book3 = new Book("Java Basics", "John Doe", 200, true);

        Reader reader1 = new Reader("Fatih", "Korap", "R001", 0);
        Reader reader2 = new Reader("Ewelina", "Izdebska", "R002", 0);

        Library library = new Library(10);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("=== Available books before borrowing ===");
        library.printAvailableBooks();

        System.out.println("=== Borrow book ===");
        library.borrowBook("1984", reader1);
        reader1.printData();

        System.out.println("=== Available books after borrowing ===");
        library.printAvailableBooks();

        System.out.println("=== Return book ===");
        library.returnBook("1984", reader1);
        reader1.printData();

        System.out.println("=== Available books after return ===");
        library.printAvailableBooks();

        System.out.println("Available books count: " + library.countAvailableBooks());
    }
}