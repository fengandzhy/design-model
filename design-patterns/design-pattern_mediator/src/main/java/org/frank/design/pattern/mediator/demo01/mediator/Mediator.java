package org.frank.design.pattern.mediator.demo01.mediator;

import org.frank.design.pattern.mediator.demo01.colleague.Aircraft;

public interface Mediator {
    void sendMessage(String message, Aircraft aircraft);
    void addAircraft(Aircraft aircraft);
}
