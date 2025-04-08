package com.infnet;

import com.constants.EFreteType;
import com.dominio.pedido.Entrega;
import com.servicos.CalculadoraFrete;
import com.servicos.EtiquetaService;
import com.servicos.interfaces.ICalculadoraFrete;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Entrega e = new Entrega("Endereço de coleta", "Endereço de destino", 10);
       
        ICalculadoraFrete calc = new CalculadoraFrete( e, EFreteType.ECO );
        calc.aplicarFretePromocional();

        EtiquetaService et = new EtiquetaService(calc);
        et.gerarEtiqueta();
        et.gerarResumoPedido();
    }
}
