package com.tedeevgv.patterns.structural.adapter;

public class Iphone {

    public void charge(LightningCharger lightningCharger) {
        lightningCharger.doLightningCharge();
    }
}
