package com.servicos;

import com.constants.EFreteType;
import com.dominio.frete.IFrete;
import com.dominio.pedido.Entrega;
import com.dominio.pedido.Pedido;
import com.servicos.interfaces.ICalculadoraFrete;

public class CalculadoraFrete implements ICalculadoraFrete {
    private Entrega entrega;
    private IFrete frete;
    private boolean isFretePromocional;

    public CalculadoraFrete(Entrega entrega, EFreteType tipoDeFrete){
        this.entrega = entrega;
        this.frete = FreteFactory.criarFrete(tipoDeFrete);
        this.isFretePromocional = false;
    }

    @Override
    public double calcularFrete(){
        return frete.calcularFrete(entrega.getPeso());
    } 

    public Pedido GerarPedido(){
        return new Pedido(entrega, calcularFrete(), frete.getType());
    }

    @Override
    public void aplicarFretePromocional() {
        if (entrega.getPeso() > 10) {
            isFretePromocional = true;
        }
    }

    @Override
    public boolean isFreteGratis() {
        return frete.isFreteGratis(entrega.getPeso());
    }

    @Override
    public String getDestinatario() {
        return entrega.getDestinatario();
    }

    @Override
    public EFreteType getTipoFrete() {
        return frete.getType();
    }

    @Override
    public String getEndereco() {
        return entrega.getEndereco();
    }
}
