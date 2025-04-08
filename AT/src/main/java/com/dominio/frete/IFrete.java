package com.dominio.frete;

import com.constants.EFreteType;

public interface IFrete {
    public double calcularFrete(double peso);
    public boolean isFreteGratis(double peso);
    public EFreteType getType();
}
