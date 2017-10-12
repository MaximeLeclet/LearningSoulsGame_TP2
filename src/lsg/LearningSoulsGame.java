package lsg;

import lsg.characters.*;
import lsg.weapons.Sword;

public class LearningSoulsGame {

    public static void main(String[] args) {

        Hero maxime = new Hero("Maxime");

        Sword epee = new Sword();

        maxime.printStats();
        System.out.println("attaque avec " + epee.toString() + " > " +maxime.attackWith(epee));
        maxime.printStats();
        System.out.println("attaque avec " + epee.toString() + " > " +maxime.attackWith(epee));
        maxime.printStats();
        System.out.println("attaque avec " + epee.toString() + " > " +maxime.attackWith(epee));

    }

}
