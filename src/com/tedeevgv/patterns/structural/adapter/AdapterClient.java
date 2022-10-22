package com.tedeevgv.patterns.structural.adapter;

public class AdapterClient {
    public static void main(String[] args) {
        LightningCharger lightningCharger = new LightningChargerImpl();
        Iphone iphone = new Iphone();
        iphone.charge(lightningCharger);

        LightningCharger typeCToLightningChargerAdapter = new TypeCToLightningChargerAdapter();
        iphone.charge(typeCToLightningChargerAdapter);
    }
}
