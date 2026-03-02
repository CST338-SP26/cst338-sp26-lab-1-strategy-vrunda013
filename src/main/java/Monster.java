import java.util.Objects;

public abstract class Monster{

    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap <String, Integer> items;

    public Monster(Integer xp, Integer maxHP, HashMap <String, Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public boolean equals(Object){

    }

    public String toString(){

    }




}