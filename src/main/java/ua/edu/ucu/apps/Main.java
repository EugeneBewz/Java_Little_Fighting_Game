package ua.edu.ucu.apps;

import ua.edu.ucu.apps.characters.Character;

public class Main{
    public static void main(String[] args) {
        Character firstCombatant = CharacterFactory.createCharacter();
        Character secondCombatant = CharacterFactory.createCharacter();

        GameManager.fight(firstCombatant, secondCombatant);
    }
}