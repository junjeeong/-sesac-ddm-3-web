package ch12_BaseModule.p3;

public class Main {
    public static void main(String[] args) {
        String 숫자연결 = new StringBuilder().append("12345678910").toString();
        String 중간삽입 = new StringBuilder().append("12345678910").insert(5, "[inserted]").toString();
        String 문자삭제 = new StringBuilder().append("12345678910").insert(5, "[inserted]").delete(중간삽입.indexOf("6"), 중간삽입.indexOf("6") + 1).toString();
        String 뒤집기 = new StringBuilder().append("12345678910").insert(5, "[inserted]").delete(중간삽입.indexOf("6"), 중간삽입.indexOf("6") + 1).reverse().toString();

        System.out.println("숫자 연결: " + 숫자연결);
        System.out.println("중간 삽입: " + 중간삽입);
        System.out.println("문자 삭제: " + 문자삭제);
        System.out.println("뒤집기: " + 뒤집기);
    }
}
