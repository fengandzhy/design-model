package org.frank.design.pattern.adapter.demo01;

import org.frank.design.pattern.adapter.demo01.adaptee.EuropeanPlug;
import org.frank.design.pattern.adapter.demo01.adapter.PowerAdapter;
import org.frank.design.pattern.adapter.demo01.target.USASocket;

/**
 * 适配器模式的主要目的是解决接口不兼容问题，使原本由于接口不兼容而不能一起工作的类可以一起工作。
 * 通过创建一个中间“适配器”层，适配器模式能够让原本接口不匹配的对象能够无缝协作，增强了软件组件的复用性和灵活性。
 * */
public class AdapterDemo01Test {
    public static void main(String[] args) {
        EuropeanPlug europeanPlug = new EuropeanPlug();
        USASocket usaSocket = new PowerAdapter(europeanPlug);
        usaSocket.powerWithTwoRoundPins(); // 现在可以使用美式电源插座供电了
    }
}
