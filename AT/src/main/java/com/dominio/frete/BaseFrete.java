package com.dominio.frete;

import com.constants.EFreteType;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class BaseFrete implements IFrete {
    
    private final EFreteType type= null;
    private final double incrementalModifier = 0;
    private final double multiplicativeModifier = 1;
    
    public double calcularFrete(double peso) {
        return peso * multiplicativeModifier + incrementalModifier;
    }

    public boolean isFreteGratis(double peso) {
        return false;
    }

    public EFreteType getType(){
        return this.type;
    }
}
