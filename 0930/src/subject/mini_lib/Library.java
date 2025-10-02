package subject.mini_lib;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void registerMember(Member member){
        members.add(member);
    }

    public void lendBook(String isbn, String memberId) {
        books.forEach(book -> {
            if(book.isbn.equals(isbn)) {
                if (!book.isAvailable) {
                    System.out.printf("%s은(는) 이미 대여 중입니다.\n", book.title);
                }
                book.isAvailable = false;
                updateBorrowedBooks(book, memberId);
                System.out.printf("%s책 대여 완료. (대여자: %s)\n", book.title, getMemberName(memberId));
            }
        });
    }

    public void returnBook(String isbn, String memberId) {
        books.forEach(book -> {
           if(book.isbn.equals(isbn)) {
               book.isAvailable = true;
               removeBorrowedBooks(book, memberId);
               System.out.printf("%s 책 반납 완료. (반납자: %s)\n", book.title, getMemberName(memberId));
           }
        });
    }

    public void printAvailableBooks(){
        System.out.println("=== 대여 가능한 책 목록===");
        books.forEach(book -> {
            if(book.isAvailable) {
                System.out.printf("%s\n", book.title);
            }
        });
    }

    public void updateBorrowedBooks(Book book, String memberId){
        members.forEach(member -> {
            if(member.memberId.equals(memberId)) {
                member.borrowedBooks.add(book);
            }
        });
    }

    public void removeBorrowedBooks(Book book, String memberId){
        members.forEach(member -> {
            if(member.memberId.equals(memberId)) {
                member.borrowedBooks.remove(book);
            }
        });
    }

    public String getMemberName(String memberId) {
        for(Member member : members) {
            if(member.memberId.equals(memberId)) return member.name;
        }
        return null;
    }
 }
