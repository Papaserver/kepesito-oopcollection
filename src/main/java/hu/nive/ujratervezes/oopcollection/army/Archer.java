package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {

    int hp = 50;
    int damage = 20;

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
        hp -= damage;
    }

}