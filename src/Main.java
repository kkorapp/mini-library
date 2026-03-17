public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", 328, true);
        Book book2 = new Book("Clean Code", "Robert Martin", 450, true);
        Book book3 = new Book("Java Basics", "John Doe", 200, true);

        Reader reader1 = new Reader("Fatih", "Korap", "R001", 0);
        Reader reader2 = new Reader("Ewelina", "Izdebska", "R002", 0);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        reader1.printData();
        reader2.printData();

        reader1.increaseBorrowedCount();
        reader1.printData();

        reader1.decreaseBorrowedCount();
        reader1.printData();
    }
}