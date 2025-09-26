package ch6.p3;

public class p3 {
    public static void main(String[] args) {
        Book 자바의정석 = new Book("자바의 정석", "남궁성", "978-89-xxxx-xxx-x");
        System.out.print("도서 정보: ");
        자바의정석.getBookInfo();
        System.out.println("상태:" + (자바의정석.isAvailable ? "대출 가능" : "대출 불가능"));

        // 도서를 빌림 후 상태 출력
        자바의정석.borrowBook(); // 상호작용 - 도서를 빌림 -> isAvailable 필드 변경 = true -> false
        System.out.println("상태:" + (자바의정석.isAvailable ? "대출 가능" : "대출 불가능"));

        // 도서를 반납 후 상태 출력
        자바의정석.returnBook(); // 상호작용 - 도서 반납 - > isAvailable 필드 변경 = false -> true
        System.out.println("상태:" + (자바의정석.isAvailable ? "대출 가능" : "대출 불가능"));
    }
}
