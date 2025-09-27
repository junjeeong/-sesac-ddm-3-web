package ch7.p1;

public class p1 {
    public static void main(String[] args) {

        Dog 골든리트리버 = new Dog("맥스", 3, "골든 리트리버");

        골든리트리버.eat();
        골든리트리버.sleep();
        골든리트리버.makeSound();

        System.out.println(골든리트리버.breed + " " + 골든리트리버.name + "가 짖습니다.");
    }
}
