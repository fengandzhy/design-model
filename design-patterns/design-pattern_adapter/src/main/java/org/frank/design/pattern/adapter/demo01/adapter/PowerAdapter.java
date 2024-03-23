package org.frank.design.pattern.adapter.demo01.adapter;

import org.frank.design.pattern.adapter.demo01.adaptee.EuropeanPlug;
import org.frank.design.pattern.adapter.demo01.target.USASocket;

public class PowerAdapter implements USASocket {
    private EuropeanPlug europeanPlug;
    
    public PowerAdapter(EuropeanPlug europeanPlug){
        this.europeanPlug = europeanPlug;
    }
    
    @Override
    public void powerWithTwoRoundPins() {
        europeanPlug.powerWithTwoFlatPins();
        System.out.println("Adapter converts two flat pins to two round pins.");
    }
}
