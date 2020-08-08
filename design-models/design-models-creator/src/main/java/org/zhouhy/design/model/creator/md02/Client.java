package org.zhouhy.design.model.creator.md02;

import org.zhouhy.design.model.creator.md02.director.Director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.sendGoodBye("toAddress@126.com", "fromAddress@126.com");
    }
}
