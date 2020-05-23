package kg.geektech.les8.players;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.STUN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int randomNumber = r.nextInt(4); // 0, 1, 2, 3
        if (randomNumber == 1) {
            System.out.println("Thor got a chance to stun!");
            boss.setStunned(true);
        } else {
            boss.setStunned(false);
        }
    }
}
