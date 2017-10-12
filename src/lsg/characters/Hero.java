package lsg.characters;

public class Hero extends Character {

    public Hero() {
        super();
        this.setName("Gregooninator");
        this.setMaxLife(100);
        this.setLife(this.getMaxLife());
        this.setMaxStamina(50);
        this.setStamina(this.getMaxStamina());
    }

    public Hero(String name) {
        this();
        this.setName(name);
    }

}
