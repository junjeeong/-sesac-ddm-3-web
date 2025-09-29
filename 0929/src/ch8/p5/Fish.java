package ch8.p5;

public class Fish implements Movable, Swimable{
    @Override
    public void swim(){
        System.out.println("물고기가 수영합니다.");
    }
    @Override
    public void move(){
        System.out.println("물고기가 이동합니다.");
    }
}
