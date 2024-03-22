package org.frank.desigh.pattern.flyweight.demo01;

import org.frank.desigh.pattern.flyweight.demo01.factory.CharacterFactory;
import org.frank.desigh.pattern.flyweight.demo01.flyweight.Character;

public class FlyweightDemo01Test {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        // 外部状态
        int positionX = 0;
        int positionY = 0;
        int fontSize = 12;

        Character characterA = factory.getCharacter('A', "Arial", "Black");
        characterA.display(fontSize, positionX++, positionY);

        Character characterB = factory.getCharacter('B', "Arial", "Black");
        characterB.display(fontSize, positionX++, positionY);

        // 使用相同的内部状态但不同的外部状态
        Character anotherA = factory.getCharacter('A', "Arial", "Black");
        anotherA.display(14, 10, 10);
    }
}
