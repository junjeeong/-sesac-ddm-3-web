package ch6.p1;

public class Student {
    // 클래스의 필드 선언
    String name;
    int age;
    String studentId;

    Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    void introduce() {
        System.out.println("안녕하세요 저는 " + this.name + "입니다.");
        System.out.println("나이 : " + this.age + "세");
        System.out.println("학번 : " + this.studentId);
    }
}
