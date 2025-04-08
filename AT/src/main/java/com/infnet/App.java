package com.infnet;

import com.apresentacao.ExibirCLI;
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
        
        ExibirCLI exibicao = new ExibirCLI();
        exibicao.print(et.gerarEtiqueta());
        exibicao.print(et.gerarResumoPedido());
        exibicao.close();
    }
}
