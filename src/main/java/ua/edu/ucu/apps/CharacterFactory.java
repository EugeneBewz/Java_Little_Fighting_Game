package ua.edu.ucu.apps;

import ua.edu.ucu.apps.characters.*;
import ua.edu.ucu.apps.characters.Character;

import java.util.Random;

public class CharacterFactory {
    public static Character createCharacter() {
        Random random = new Random();
        int characterCode = random.nextInt(4);

        return switch (characterCode) {
            case 0 -> new Hobbit();
            case 1 -> new Elf();
            case 2 -> new Knight();
            case 3 -> new King();
            default -> null;
        };
    }
}
