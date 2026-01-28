package bookpackage;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(1, "Java Programming", 600);
        books[1] = new Book(2, "C++ Programming", 450);
        books[2] = new Book(3, "Python Programming", 700);
        books[3] = new Book(4, "Data Structures", 550);
        books[4] = new Book(5, "Operating Systems", 400);

        double sum = 0;

        System.out.println("Books with price greater than 500:");
        for (Book b : books) {
            if (b.price > 500) {
                System.out.println("BookID: " + b.bookId + ", Title: " + b.title + ", Price: " + b.price);
            }
            sum += b.price;
        }

        double average = sum / books.length;
        System.out.println("Average Book Price: " + average);
    }
}
