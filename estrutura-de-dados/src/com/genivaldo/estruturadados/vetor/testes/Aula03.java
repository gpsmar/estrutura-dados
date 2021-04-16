package com.genivaldo.estruturadados.vetor.testes;

import com.genivaldo.estruturadados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(2);
        // vetor.adicionaElementoFinalVetor01("Elemento 1");
        // vetor.adicionaElementoFinalVetor01("Elemento 2");
        
        try {
            vetor.adicionarElementoFinalVetor02("Elemento 1");
            vetor.adicionarElementoFinalVetor02("Elemento 2");
            vetor.adicionarElementoFinalVetor02("Elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        
    }
}
