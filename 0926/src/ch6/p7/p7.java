package ch6.p7;

public class p7 {
    public static void main(String[] args) {
        Grade junyeong = new Grade("정준영", 90, 90, 90);
        junyeong.calculateTotal();
        junyeong.calculateAverage();
        junyeong.getGrade();
        junyeong.printReport();
    }
}
