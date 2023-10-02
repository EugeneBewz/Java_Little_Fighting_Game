package ua.edu.ucu.apps.characters;

import ua.edu.ucu.apps.kick.KickStrategy;

import java.util.Random;

public class Noble extends Character implements KickStrategy {
    private static final Random random = new Random();
    public Noble(int min, int max) {
        super(random.nextInt(min, max), random.nextInt(min, max));
    }

    public void kick(Character c) {
        /*
        No peasant shall escape obeying the Crown!
         */
        c.setHp(c.getHp() - this.getHp());
    }
}
