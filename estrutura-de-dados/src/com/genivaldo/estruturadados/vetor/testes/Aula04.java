package com.genivaldo.estruturadados.vetor.testes;

import com.genivaldo.estruturadados.vetor.Vetor;

public class Aula04 {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(10);
        
        vetor.adicionarElementoFinalVetor03("Elemento 1");
        vetor.adicionarElementoFinalVetor03("Elemento 2");
        vetor.adicionarElementoFinalVetor03("Elemento 3");

        //System.out.println(vetor.retornarTamanhoRealVetor());
        System.out.println(vetor.buscarElemento(-2));
        
    }
}
