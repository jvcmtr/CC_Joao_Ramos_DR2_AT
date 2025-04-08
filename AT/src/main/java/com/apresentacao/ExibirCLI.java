package com.apresentacao;

public class ExibirCLI {
    public ExibirCLI(){
        System.out.println("\n__________________________________________");
        System.out.println("=== CALCULADORA DE FRET ===");
        System.out.println();
    }
    
    public void print(String s){
        System.out.println("    _________________________");
        System.out.println("\t" + s.replace("\n", "\n\t"));
        System.out.println();
    }
    
    public void close(){
        System.out.println();
        System.out.println();
        System.out.println("...terminando execução");
        System.out.println("__________________________________________");
    }

}
