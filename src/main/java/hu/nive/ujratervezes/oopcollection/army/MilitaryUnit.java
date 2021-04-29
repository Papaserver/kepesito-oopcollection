package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    int hp;
    int damage;
    boolean armoredUnit;

    public abstract int getHitPoints();

    public abstract int doDamage();

    public abstract void sufferDamage(int damage);
}
