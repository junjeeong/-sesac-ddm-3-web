package subject.mini_library;

public class Book {
    // 필드(객체가 저장하고 있는 데이터) 정의
    String title;
    String author;
    String isbn;
    boolean isAvailable = true;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}
