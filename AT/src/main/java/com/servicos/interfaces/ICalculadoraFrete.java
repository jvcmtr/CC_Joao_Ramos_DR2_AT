package com.servicos.interfaces;

import com.constants.EFreteType;

public interface ICalculadoraFrete {
    public double calcularFrete();
    public void aplicarFretePromocional();
    public boolean isFreteGratis();

    public String getDestinatario();
    public String getEndereco();
    public EFreteType getTipoFrete();
}
