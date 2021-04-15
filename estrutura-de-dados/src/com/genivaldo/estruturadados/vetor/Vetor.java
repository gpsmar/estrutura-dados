package com.genivaldo.estruturadados.vetor;

import java.lang.ref.Cleaner;
import java.util.Arrays;

public class Vetor {

    private String[] elementosVetor;
    private int tamanhoRealVetor;

    public Vetor(int capacidade){
        this.elementosVetor = new String[capacidade];
        this.tamanhoRealVetor = 0;
    }

    // Método não otimizado para checar as posicições vazias de um vetor
    public void adicionaElementoFinalVetor01(String elemento){
        for (int i = 0; i < this.elementosVetor.length; i++) {
            if (this.elementosVetor[i] == null){
                this.elementosVetor[i] = elemento;
                break;
            }
        }
    }

    // Método otimizado para adição de elemento no
    public void adicionaElementoFinalVetor02(String elemento) throws Exception{
        if (this.tamanhoRealVetor < this.elementosVetor.length){
            this.elementosVetor[this.tamanhoRealVetor] = elemento;
            this.tamanhoRealVetor++;
        } else {
            throw new Exception("O vetor está cheio e não pode adicionar novos elementos");
        }
    }
    
    // Método opcional para adição de elemento no
    public boolean adicionaElementoFinalVetor03(String elemento) {
        if (this.tamanhoRealVetor < this.elementosVetor.length){
            this.elementosVetor[this.tamanhoRealVetor] = elemento;
            this.tamanhoRealVetor++;
            //System.out.println(this.elementosVetor.toString());
            return true;
        } 
        return false;
    }

    public int retornarTamanhoRealVetor(){
        return tamanhoRealVetor;
    }

    @Override
    public String toString() {
        StringBuilder stringVetor = new StringBuilder();
        stringVetor.append("[");

        for (int i = 0; i < this.tamanhoRealVetor - 1; i++) {
            stringVetor.append(this.elementosVetor[i]);
            stringVetor.append(", ");
        }

        if (this.tamanhoRealVetor > 0){
            stringVetor.append(this.elementosVetor[this.tamanhoRealVetor - 1]);
        }

        stringVetor.append("]");

        return stringVetor.toString();

        // return Arrays.toString(elementosVetor);
    }
}
