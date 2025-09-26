package ch6.p3;

public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable = true;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void borrowBook() {
        this.isAvailable = false;
        System.out.println("도서가 대출되었습니다.");
    }

    void returnBook(){
        this.isAvailable = true;
        System.out.println("도서가 반납되었습니다.");
    }

    void getBookInfo() {
        System.out.println(this.title + "-" + this.author + "(ISBN : " + this.isbn + ")");
    }
}
