package ch8.p5;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Fish fish = new Fish();
        Warrior warrior = new Warrior();

        dragon.move();
        dragon.fly();
        dragon.attack();
        dragon.magicAttack();

        System.out.println();

        fish.move();
        fish.swim();

        System.out.println();

        warrior.move();
        warrior.attack();
    }
}
