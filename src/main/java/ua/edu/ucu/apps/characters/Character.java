package ua.edu.ucu.apps.characters;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;


    public void setHp(int newHP) {
        hp = newHP;
    }

    public void setPower(int newPower) {
        power = newPower;
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        /*
        Says whether current character is alive (his HP is positive non-zero)
         */
        return (getHp() > 0);
    }

    public String getCharacterName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{}";
    }
}