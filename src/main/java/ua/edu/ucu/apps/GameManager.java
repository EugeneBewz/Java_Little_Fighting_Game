package ua.edu.ucu.apps;

import ua.edu.ucu.apps.characters.Character;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        final String character1 = c1.getCharacterName();
        final String character2 = c2.getCharacterName();

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(
                    character1+" attacks and deals "+c1.getPower()+" damage! Enemy's HP left — " + c2.getHp()+ "."
            );

            System.out.println();

            c2.kick(c1);
            System.out.println(
                    character2+" attacks and deals "+c2.getPower()+" damage! Enemy's HP left — " + c1.getHp()+ "."
            );
        }

        if (!c1.isAlive()) {
            System.out.println(character1+" is dead!");
        } else {
            System.out.println(character1+" is dead!");
        }
    }
}
