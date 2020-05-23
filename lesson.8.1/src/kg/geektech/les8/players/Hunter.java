package kg.geektech.les8.players;

public class Hunter extends Hero {
    private int partOfBossDamage;

    public Hunter(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        this.partOfBossDamage = partOfBossDamage;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] != this && heroes[i].getHealth() > 0 && !boss.isStunned()) {
                heroes[i].setHealth(heroes[i].getHealth() + partOfBossDamage);

            }
        }
    }
    }