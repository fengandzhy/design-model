package org.frank.design.pattern.mediator.demo01;

import org.frank.design.pattern.mediator.demo01.colleague.Aircraft;
import org.frank.design.pattern.mediator.demo01.colleague.Boeing737;
import org.frank.design.pattern.mediator.demo01.mediator.AirTrafficControl;
import org.frank.design.pattern.mediator.demo01.mediator.Mediator;

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
