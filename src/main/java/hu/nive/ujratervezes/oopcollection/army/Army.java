package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        army.forEach(milun -> milun.sufferDamage(damage));
        army.removeIf(milun -> milun.getHitPoints() < 25);
    }

    public int getArmyDamage() {
        return army.stream().mapToInt(MilitaryUnit::doDamage).sum();
    }

    public int getArmySize() {
        return army.size();
    }
}