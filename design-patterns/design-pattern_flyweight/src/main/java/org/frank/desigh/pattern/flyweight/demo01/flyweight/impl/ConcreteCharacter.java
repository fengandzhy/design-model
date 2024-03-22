package org.frank.desigh.pattern.flyweight.demo01.flyweight.impl;

import org.frank.desigh.pattern.flyweight.demo01.flyweight.Character;

public class ConcreteCharacter implements Character {

    private final char character;
    private final String fontFamily; // 内部状态
    private final String color; // 内部状态

    public ConcreteCharacter(char character, String fontFamily, String color) {
        this.character = character;
        this.fontFamily = fontFamily;
        this.color = color;
    }
    
    @Override
    public void display(int fontSize, int positionX, int positionY) {
        System.out.println("Displaying " + character + " in " + fontFamily + " with color " + color
                + " at size " + fontSize + " in position (" + positionX + ", " + positionY + ")");
    }
}
