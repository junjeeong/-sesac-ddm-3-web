package ch8.p5;

public class Warrior implements Movable, Attackable{
    @Override
    public void move() {
        System.out.println("전사가 이동합니다.");
    }
    @Override
    public void attack() {
        System.out.println("전사가 물리 공격을 합니다.");
    }
}
