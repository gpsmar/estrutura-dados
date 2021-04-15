package com.genivaldo.estruturadados.vetor;

public class Vetor {

    private String[] vetorElementos;
    private int tamanhoRealVetor;

    public Vetor(int capacidade){
        this.vetorElementos = new String[capacidade];
        this.tamanhoRealVetor = 0;
    }

    // Método não otimizado para checar as posicições vazias de um vetor
    public void adicionaElementoFinalVetor01(String elemento){
        for (int i = 0; i < this.vetorElementos.length; i++) {
            if (this.vetorElementos[i] == null){
                this.vetorElementos[i] = elemento;
                break;
            }
        }
    }

    // Método otimizado para adição de elemento no
    public void adicionaElementoFinalVetor02(String elemento) throws Exception{
        if (this.tamanhoRealVetor < this.vetorElementos.length){
            this.vetorElementos[this.tamanhoRealVetor] = elemento;
            this.tamanhoRealVetor++;
        } else {
            throw new Exception("O vetor está cheio e não pode adicionar novos elementos");
        }
    }
    
    // Método opcional para adição de elemento no
    public boolean adicionaElementoFinalVetor03(String elemento) {
        if (this.tamanhoRealVetor < this.vetorElementos.length){
            this.vetorElementos[this.tamanhoRealVetor] = elemento;
            this.tamanhoRealVetor++;
            return true;
        } 
        return false;
    }
}
