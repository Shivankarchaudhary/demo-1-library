public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.bookTitle = "TO KILL A MOCKINGBIRD";
        book.authorName = "Harper Lee";
        book.ISBNNo = "9780749301347";
        book.yearOfPublishing = 1960;
        book.displayBookDetails();

    }
}
