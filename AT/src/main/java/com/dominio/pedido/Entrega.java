package com.dominio.pedido;

import lombok.Value;

@Value // Notação lombok para tornar a classe imutavel...   torna todos os atributos private final e cria construtores e getters.
public class Entrega {//                                 mais detalhes em: https://projectlombok.org/features/Value 
    String endereco;
    String destinatario;
    double peso;

    public Entrega(String endereco, String destinatario, double peso){
        if(peso <= 0)
            throw new IllegalArgumentException("O peso de uma encomenda deve ser superiror a zero");
        
        if(endereco.length() < 0 )
            throw new IllegalArgumentException("O endereço fornescido não é valido");
        
        if(destinatario.length() < 0 )
            throw new IllegalArgumentException("O destinatario fornescido não é valido");

        if(destinatario.equals(endereco))
            throw new IllegalArgumentException("O destinatario deve ser diferente do endereco de entrega");
        
        this.destinatario = destinatario;
        this.endereco = endereco;
        this.peso = peso;
    }
}
