public class Reader {
    private String firstName;
    private String lastName;
    private String cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, String cardNumber, int borrowedCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;
    }

    public void printData() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Card number: " + cardNumber);
        System.out.println("Borrowed count: " + borrowedCount);
        System.out.println();
    }

    public void increaseBorrowedCount() {
        borrowedCount++;
        System.out.println(firstName + " borrowed a book.");
    }

    public void decreaseBorrowedCount() {
        if (borrowedCount > 0) {
            borrowedCount--;
            System.out.println(firstName + " returned a book.");
        } else {
            System.out.println("Borrowed count cannot be less than 0.");
        }
    }
}