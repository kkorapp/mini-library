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

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        reader1.printData();
        reader2.printData();

        reader1.increaseBorrowedCount();
        reader1.printData();

        reader1.decreaseBorrowedCount();
        reader1.printData();

        library.printAvailableBooks();

        Book foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found book:");
            foundBook.printInfo();
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("Available books count: " + library.countAvailableBooks());
    }
}
