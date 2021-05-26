package Modul5;

public class Mage {
    String name;
    int level;
    int damage;
    String type;

    Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    String getInfo() {
        return name + ", " + level + ", " + damage + ", " + type;
    }

    String fight(Mage mage) {
        // проверяем все возможные ситуации
        if (this.type.equals("fire") && mage.type.equals("ice")) return this.name;
        else if (this.type.equals("ice") && mage.type.equals("earth")) return this.name;
        else if (this.type.equals("earth") && mage.type.equals("fire")) return this.name;
        else if (!this.type.equals(mage.type)) return mage.name;
        else {
            if (this.level > mage.level) return this.name;
            else if (this.level < mage.level) return mage.name;
            else {
                if (this.damage > mage.damage) return this.name;
                else if (this.damage < mage.damage) return mage.name;
                else return "draw";
            }
        }
    }
}
class MageTest{
    public static void main(String[] args) {
        Mage m1 = new Mage ("шаман",1,1,"fire");
        Mage m2 = new Mage ("Mage1",2,2,"ice");
        System.out.println(m1.getInfo());
        System.out.println(m2.getInfo());
        System.out.println(m1.fight(m2));
    }
}
