class Book{
    String bookTitle;
    String ISBNNo;
    int yearOfPublishing;
    String authorName;

    public void displayBookDetails() {
        System.out.println("The book title is      : " + bookTitle);
        System.out.println("The ISBN number is     : " + ISBNNo);
        System.out.println("The year of publish is : " + yearOfPublishing);
        System.out.println("The author name is     : " + authorName);

    }
}
