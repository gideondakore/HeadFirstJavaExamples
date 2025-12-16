package com.amalitech.testing.game;

import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public record GameCharacter(int power, String type, String[] weapons, int location) implements Serializable {
    @Serial
    private static final long serialVersionUID = -7139149703228045270L;


    public String getWeapons() {
        return Arrays.toString(weapons);
    }

    @Override
    public String toString(){
        return Arrays.toString(weapons);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameCharacter character = (GameCharacter) o;
        return type.equals(character.type) && Arrays.equals(weapons, character.weapons) && power == character.power;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(type) + Objects.hashCode(power);
        result = 31 * result + Arrays.hashCode(weapons);
        return result;
    }

}
