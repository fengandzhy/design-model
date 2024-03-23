package org.frank.design.pattern.mediator.demo01.mediator;

import org.frank.design.pattern.mediator.demo01.colleague.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControl implements Mediator {

    private final List<Aircraft> aircraftList;

    public AirTrafficControl() {
        this.aircraftList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, Aircraft aircraft) {
        for (Aircraft a : aircraftList) {
            // Don't notify the aircraft sending the message
            if (a != aircraft) {
                a.receive(message);
            }
        }
    }

    @Override
    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }
}
