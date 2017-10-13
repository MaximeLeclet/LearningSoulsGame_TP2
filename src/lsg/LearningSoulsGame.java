package lsg;

import lsg.characters.*;
import lsg.weapons.Claw;
import lsg.weapons.ShotGun;
import lsg.weapons.Sword;
import lsg.weapons.Weapon;

import java.lang.Character;
import java.util.Scanner;

public class LearningSoulsGame {

    public static void refresh(lsg.characters.Character character1, lsg.characters.Character character2) {

        character1.printStats();
        character2.printStats();

    }

    public static void main(String[] args) {

        lsg.characters.Character hero = new Hero();
        Weapon armeHero = new Sword();
        hero.setWeapon(armeHero);

        lsg.characters.Character monstre = new Monster();
        Weapon armeMonstre = new Claw();
        monstre.setWeapon(armeMonstre);

        Scanner scanner = new Scanner(System.in);

        boolean tourHero = true;
        int degats;

        refresh(hero, monstre);

        while(true) {

            System.out.println("Appuyez sur 'entrée' pour le prochain tour > ");
            scanner.nextLine();

            if(tourHero) {

                degats = hero.attack();
                System.out.println(hero.getName() + " attaque " + monstre.getName() + " avec ");

            }

        }

    }

}
