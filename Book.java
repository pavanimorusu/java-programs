public class Book {
    String bookName;
    String isbn;
    String author;
    String publisher;

    public Book(String bookName, String isbn, String author, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    // Getter for bookName
    public String getBookName() {
        return bookName;
    }

    // Setter for bookName
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // Getter for isbn
    public String getIsbn() {
        return isbn;
    }

    // Setter for isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for publisher
    public String getPublisher() {
        return publisher;
    }

    // Setter for publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookInfo() {
        return bookName + ", " + isbn + ", " + author + ", " + publisher;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "123456789", "John Doe", "Tech Books");
        System.out.println(book.getBookInfo());

        // Example of using setter methods
        book.setBookName("Advanced Java Programming");
        book.setIsbn("987654321");
        book.setAuthor("Jane Smith");
        book.setPublisher("Expert Books");

        // Print updated book information using getter methods
        System.out.println("Updated Book Info: " + book.getBookName() + ", " + book.getIsbn() + ", " + book.getAuthor() + ", " + book.getPublisher());
    }
}
