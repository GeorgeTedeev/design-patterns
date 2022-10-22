package com.tedeevgv.patterns.structural.adapter;

public class LightningChargerImpl implements LightningCharger {
    @Override
    public void doLightningCharge() {
        System.out.println("Lightning charger is on!");
    }
}
