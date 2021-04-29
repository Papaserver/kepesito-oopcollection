package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    int hp = 100;
    int damage = 10;
    int round = 1;
    boolean armoredUnit;

    public Swordsman (boolean armoredUnit) {
        this.armoredUnit = armoredUnit;
    }

    @Override
    public int getHitPoints() {
        return hp;
    }

    @Override
    public int doDamage() {
        return damage;
    }

    @Override
    public void sufferDamage(int damage) {
        if (round != 1) {
            if (armoredUnit) {
                hp -= damage / 2;
            } else {
                hp -= damage;
            }
        } else {
            round++;
        }
    }
}