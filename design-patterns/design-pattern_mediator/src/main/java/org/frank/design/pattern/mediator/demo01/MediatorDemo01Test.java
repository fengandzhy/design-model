package org.frank.design.pattern.mediator.demo01;

import org.frank.design.pattern.mediator.demo01.colleague.Aircraft;
import org.frank.design.pattern.mediator.demo01.colleague.Boeing737;
import org.frank.design.pattern.mediator.demo01.mediator.AirTrafficControl;
import org.frank.design.pattern.mediator.demo01.mediator.Mediator;

/**
 * 中介者模式（Mediator Pattern）是一种行为设计模式，旨在减少对象之间的直接通信，并通过中介者对象来协调对象之间的交互。
 * 在中介者模式中，对象之间不再直接相互引用，而是通过一个中介者对象来进行通信和协调。
 * */
public class MediatorDemo01Test {
    public static void main(String[] args) {
        Mediator mediator = new AirTrafficControl();

        Aircraft flight1 = new Boeing737(mediator, "Flight 1");
        Aircraft flight2 = new Boeing737(mediator, "Flight 2");

        mediator.addAircraft(flight1);
        mediator.addAircraft(flight2);

        flight1.send("Climbing to 30,000 ft.");
        flight2.send("Descending to 10,000 ft.");
    }
}
