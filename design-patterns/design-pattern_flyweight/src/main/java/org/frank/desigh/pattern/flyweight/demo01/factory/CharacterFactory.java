package org.frank.desigh.pattern.flyweight.demo01.factory;

import org.frank.desigh.pattern.flyweight.demo01.flyweight.impl.ConcreteCharacter;
import org.frank.desigh.pattern.flyweight.demo01.flyweight.Character;
import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<String, Character> characters = new HashMap<>();

    public Character getCharacter(char charName, String fontFamily, String color) {
        String key = "" + charName + fontFamily + color;
        Character character = characters.get(key);
        if (character == null) {
            character = new ConcreteCharacter(charName, fontFamily, color);
            characters.put(key, character);
        }
        return character;
    }
}
