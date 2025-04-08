package com.servicos;

import com.dominio.pedido.Pedido;
import com.servicos.interfaces.ICalculadoraFrete;

public class EtiquetaService {
    private ICalculadoraFrete calculadora;

    public EtiquetaService(ICalculadoraFrete calculadora){
        this.calculadora = calculadora;
    }

    public String gerarEtiqueta() {
        
        return "Destinatário: " + calculadora.getDestinatario() + "\nEndereço: " + calculadora.getEndereco() + "\nValor do Frete: R$" + calculadora.calcularFrete() ;
    }

    public String gerarResumoPedido() {
        return "Pedido para " + calculadora.getDestinatario()  + " com frete tipo " + calculadora.getTipoFrete() + " no valor de R$" + calculadora.calcularFrete();
    }
}
