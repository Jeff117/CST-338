import java.util.HashMap;

public abstract class Monster {
    //variables
    int maxHP, xp, hp;
    HashMap<String,Integer> items;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public boolean equals(boolean bool){
        return bool;
    }

    public int hashCode(){
        // will return something eventually
        return 0;
    }

    public String toString(){
        return "hp = " + getHp() + "/" + getMaxHP();
    }


}
