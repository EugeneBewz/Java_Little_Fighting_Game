package ua.edu.ucu.apps.characters;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        /*
        Strike an enemy with all the noble might for the glory of
        the great elven king Finwë!
         */
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        } else {
            c.setPower(c.getPower()-1);
        }
    }
}
