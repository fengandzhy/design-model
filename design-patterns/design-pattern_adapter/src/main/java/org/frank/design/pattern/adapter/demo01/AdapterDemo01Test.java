package org.frank.design.pattern.adapter.demo01;

import org.frank.design.pattern.adapter.demo01.adaptee.EuropeanPlug;
import org.frank.design.pattern.adapter.demo01.adapter.PowerAdapter;
import org.frank.design.pattern.adapter.demo01.target.USASocket;

public class AdapterDemo01Test {
    public static void main(String[] args) {
        EuropeanPlug europeanPlug = new EuropeanPlug();
        USASocket usaSocket = new PowerAdapter(europeanPlug);
        usaSocket.powerWithTwoRoundPins(); // 现在可以使用美式电源插座供电了
    }
}
