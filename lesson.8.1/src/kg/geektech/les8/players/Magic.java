package kg.geektech.les8.players;

public class Magic extends Hero {
    private int boostAttack;

    public Magic(int health, int damage, int i) {
        super(health, damage, SuperAbility.BOOST);
        this.boostAttack = boostAttack;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] != this && heroes[i].getHealth() > 0 && !boss.isStunned()) {
                heroes[i].setHealth(heroes[i].getHealth() + boostAttack);

            }
        }
    }
}