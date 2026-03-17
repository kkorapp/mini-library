public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", 328, true);
        Book book2 = new Book("Clean Code", "Robert Martin", 450, true);
        Book book3 = new Book("Java Basics", "John Doe", 200, true);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

        book1.borrow();
        book1.printInfo();

        book1.returnBook();
        book1.printInfo();
    }
}