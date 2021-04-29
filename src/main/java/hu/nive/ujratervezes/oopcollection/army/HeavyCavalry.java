package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    int hp = 150;
    int damage = 20;
    int round = 1;

    @Override
    public int getHitPoints() {
        return hp;
    }

    @Override
    public int doDamage() {
        if (round == 1) {
            round++;
            return damage * 3;
        } else {
            return damage;
        }
    }

    @Override
    public void sufferDamage(int damage) {
            hp -= damage / 2;
    }
}