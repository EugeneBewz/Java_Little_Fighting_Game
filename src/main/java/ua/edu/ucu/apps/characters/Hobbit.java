package ua.edu.ucu.apps.characters;

public class Hobbit extends Character {
    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        toCry();
    }

    private static void toCry() {
        // make a Hobbit cry
        System.out.println(":_(");
    }
}
