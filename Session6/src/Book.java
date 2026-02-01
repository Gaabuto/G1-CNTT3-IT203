public class Book {
    private String bookId;
    private String title;
    private String author;
    private int publishYear;

    public Book(String bookId, String title, String author, int publishYear) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public void displayInfo() {
        System.out.println("----- THÔNG TIN SÁCH -----");
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Năm XB: " + publishYear);
    }
}