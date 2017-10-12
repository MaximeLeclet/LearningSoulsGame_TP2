package lsg.characters;

public class Monster extends Character {

    private static int INSTANCES_COUNT = 0;

    public Monster() {
        super();
        INSTANCES_COUNT++;
        this.setName("Monster_" + INSTANCES_COUNT);
        this.setMaxLife(10);
        this.setLife(this.getMaxLife());
        this.setMaxStamina(10);
        this.setStamina(this.getMaxStamina());
    }

    public Monster(String name) {
        this();
        this.setName(name);
    }

}
