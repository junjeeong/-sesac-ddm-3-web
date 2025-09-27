package ch7.p1;

public class Dog extends Animal {
    String breed;

    // **중요 : 부모 클래스의 생성자가 인자를 원할 경우 자식 클래스에 생성자 첫줄에 super 함수에 인자로 초기화 데이터를 전달해야한다.
    // 컴파일 시점에 어찌되었건 부모 클래스의 생성자가 먼저 호출되기 떄문이다. 어디에서? -> 자식 클래스의 생성자 첫줄에 super() 호출문에서
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound(){
        System.out.println("멍멍!");
    }
}
