package Ex06;

class Book{
    int bookId;
    String bookName;
    String author;
    int yearBirth;

    public Book(int bookId, String bookName, String author, int yearBirth) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.yearBirth = yearBirth;
    }

    public void displayInfo() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tác giả: " + author);
        System.out.println("Năm xuất bản: " + yearBirth);
        System.out.println("--------------------");
    }
};

public class Bai5 {
    public static void main(String[] args) {
        Book b1 = new Book(01, "Chiếc thuyền ngoài xa", "Nguyễn Minh Châu", 1985);
        b1.displayInfo();
    }
}