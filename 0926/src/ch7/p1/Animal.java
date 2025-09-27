package ch7.p1;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("동물이 먹고 있습니다.");
    }

    void sleep() {
        System.out.println("동물이 잠을 잡니다.");
    }

    void makeSound(){
        System.out.println("동물이 소리를 냅니다!");
    }
}
