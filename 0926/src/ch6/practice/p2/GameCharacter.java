package ch6.practice.p2;

public class GameCharacter {
    private String name;
    private int level = 1;
    private int hp = 100;
    private int maxHp = 100;

    GameCharacter (String name) {
        this.name = name;
    }

    void takeDamage(int damage) {
        if(damage > hp) {
            this.hp = 0;
        } else {
            this.hp -= damage;
            if (hp <= 0) {
                this.hp = 0;
            }
            System.out.println("[" + this.name + "]" + "이(가)" + "[" + damage + "]" + "의 피해를 입었습니다." + "(남은 HP: [" + this.hp + "])");
        }
    }

    void recoverHp(int amount) {
        if(amount > maxHp) {
            this.hp = maxHp;
        } else {
            this.hp += amount;
            if(hp > maxHp) {
                this.hp = maxHp;
            }
            System.out.println("[" + this.name + "]" + "이(가)" + "HP를 [" + amount + "]" + "만큼 회복했습니다." + "(현재 HP: [" + this.hp + "])");
        }
    }

    void levelUp() {
        this.level++;
        this.maxHp += 20;
        this.hp = this.maxHp;
        System.out.println("레벨업!" + "[" + this.name + "]" + "의 레벨이 " + "[" + this.level + "]" +"이 되었습니다. (최대 HP: [" + this.maxHp + "])" );
    }

    void getCharacterInfo() {
        System.out.println("이름 : " + "[" + this.name + "]," + "레벨 : [" + this.level + "], HP : [" + this.hp + "]/[" + this.maxHp + "]");
    }
}
