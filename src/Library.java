public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added to library: " + book.getTitle());
        } else {
            System.out.println("Library is full.");
        }
    }

    public void printAvailableBooks() {
        System.out.println("Available books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].printInfo();
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void borrowBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book != null) {
            if (book.isAvailable()) {
                book.borrow();
                reader.increaseBorrowedCount();
                System.out.println("Borrowing completed: " + title);
            } else {
                System.out.println("Book is not available.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(String title, Reader reader) {
        Book book = findBookByTitle(title);

        if (book != null) {
            if (!book.isAvailable()) {
                book.returnBook();
                reader.decreaseBorrowedCount();
                System.out.println("Return completed: " + title);
            } else {
                System.out.println("Book is already available.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }
}