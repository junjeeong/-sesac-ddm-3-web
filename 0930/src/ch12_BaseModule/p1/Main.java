package ch12_BaseModule.p1;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("김철수", 2023001, 20);
        Student std2 = new Student("김철수", 2023001, 21);

        System.out.println(std1.toString());
        System.out.println(std2.toString());
        System.out.println("두 학생은 같은 학생입니까? -> " + std1.equals(std2));
    }
}
