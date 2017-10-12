package lsg.characters;

import lsg.helpers.*;
import lsg.weapons.*;

public class Character {

    private String name;
    private int life;
    private int maxLife;
    private int stamina;
    private int maxStamina;
    private Dice dice;

    public Character() {
        dice = new Dice(101);
    }

    public Character(String name) {
        this();
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    protected void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    protected void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getStamina() {
        return stamina;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    protected void setMaxStamina(int maxStamina) {
        this.maxStamina = maxStamina;
    }

    public boolean isAlive() {
        return(this.getLife()>0);
    }

    public int attackWith(Weapon weapon) {

        if(weapon.isBroken() || this.getStamina() <= 0) {
            return 0;
        }
        else {

            int precision = this.dice.roll();

            int degats = (int) Math.round(weapon.getMinDamage() + ((precision/100.0) * (weapon.getMaxDamage() - weapon.getMinDamage())));

            if(this.getStamina() < weapon.getStamCost()) {

                float proportion = (this.getStamina()/weapon.getStamCost());

                degats = Math.round(degats * proportion);

                this.setStamina(0);

            }
            else {
                this.setStamina(this.getStamina()-weapon.getStamCost()); /////// MARCHE PAS????????
            }

            return degats;

        }

    }

    public void printStats() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String LIFE = String.format("%5d", this.getLife());
        String STAMINA = String.format("%5d",this.getStamina());
        return (String.format("%-20s %-20s LIFE:%-10s STAMINA:%-10s", ("[ " + this.getClass().getSimpleName() + " ]"), this.getName(), LIFE, STAMINA) + (this.isAlive() ? "(ALIVE)" : "(DEAD)" ));
    }

}
