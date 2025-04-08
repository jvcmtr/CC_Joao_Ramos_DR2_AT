package com.dominio.frete;

import com.constants.EFreteType;

public class FreteECO extends BaseFrete{
    private final EFreteType type = EFreteType.ECO;
    private final double incrementalModifier = -5;
    private final double multiplicativeModifier = 1.1;
    
    @Override
    public boolean isFreteGratis(double peso) {
        return peso < 2;
    }
}
