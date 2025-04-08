package com.dominio.frete;

import com.constants.EFreteType;

public class NullFrete implements IFrete {
    @Override
    public double calcularFrete(double peso) {
        return 0;
    }

    @Override
    public boolean isFreteGratis(double peso) {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == null || obj.getClass() == this.getClass();
    }    

    @Override
    public EFreteType getType() {
        return null;
    }
    
}
