package subject.mini_lib;

public class Main {
    public static void main(String[] args){
        System.out.println("==== 도서관 프로그램 시작 ===");

        // 1. Library 객체를 생성합니다.
        Library library = new Library();

        // 2. 책 3권을 생성하여 도서관에 추가합니다.
        library.addBook(new Book("Java의 정석", "남궁성", "111-222"));
        library.addBook(new Book("클린 코드", "로버트 C", "333-444"));
        library.addBook(new Book("객체지향의 사실과 오해", "조영호", "555-666"));

        // 3. 회원 2명을 생성하여 도서관에 등록합니다.
        Member junyeong = new Member( "준영", "0");
        Member jonggyun = new Member("종균", "1");
        library.registerMember(junyeong);
        library.registerMember(jonggyun);

        // 4. 회원 1이 책 1권을 대여합니다.
        library.lendBook("111-222", junyeong.memberId);

        // 5. 회원 2가 방금 대여된 책을 다시 대여하려고 시도합니다. (실패 메시지가 출력되어야 합니다)
        library.lendBook("111-222", jonggyun.memberId);

        // 6. 회원 1이 빌렸던 책을 반납합니다.
        library.returnBook("111-222", junyeong.memberId);

        System.out.println();

        // 7. 현재 대여 가능한 모든 책 목록을 출력합니다.
        library.printAvailableBooks();
    }
}
