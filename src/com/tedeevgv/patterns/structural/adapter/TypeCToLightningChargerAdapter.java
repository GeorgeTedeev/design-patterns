package com.tedeevgv.patterns.structural.adapter;

public class TypeCToLightningChargerAdapter implements LightningCharger {

    private TypeCCharger typeCCharger = new TypeCChargerImpl();

    @Override
    public void doLightningCharge() {
        typeCCharger.doTypeCCharge();
    }
}
