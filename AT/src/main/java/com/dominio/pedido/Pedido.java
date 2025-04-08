package com.dominio.pedido;

import com.constants.EFreteType;

import lombok.Getter;


@Getter
public class Pedido {
    private Entrega entrega;
    private double valorDoFrete;
    private EFreteType tipoFrete;

    public Pedido(Entrega entrega, double valorFret, EFreteType tipoFrete ){
        this.entrega = entrega;
        this.valorDoFrete = 0;
        this.tipoFrete = tipoFrete;
    }
}
