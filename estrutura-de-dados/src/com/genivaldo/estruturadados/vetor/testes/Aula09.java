package com.genivaldo.estruturadados.vetor.testes;

import com.genivaldo.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionarElementoFinalVetor03("A");
        vetor.adicionarElementoFinalVetor03("B");
        vetor.adicionarElementoFinalVetor03("C"); 
        vetor.adicionarElementoFinalVetor03("D"); 
        vetor.adicionarElementoFinalVetor03("E"); 
        
        System.out.println(vetor + " Tamanho real: " + vetor.retornarTamanhoRealVetor());
        
        vetor.removerElementoNaPosicaoIndicada(0);
        vetor.removerElementoNaPosicaoIndicada(1);
        
        System.out.println(vetor + " Tamanho real: " + vetor.retornarTamanhoRealVetor());

    }
}
