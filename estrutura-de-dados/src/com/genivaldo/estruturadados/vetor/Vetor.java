package com.genivaldo.estruturadados.vetor;

public class Vetor {

    private String[] elementosVetor;
    private int tamanhoRealVetor;

    public Vetor(int capacidade){
        this.elementosVetor = new String[capacidade];
        this.tamanhoRealVetor = 0;
    }

    // Método não otimizado para checar as posicições vazias de um vetor
    public void adicionarElementoFinalVetor01(String elemento){
        for (int i = 0; i < this.elementosVetor.length; i++) {
            if (this.elementosVetor[i] == null){
                this.elementosVetor[i] = elemento;
                break;
            }
        }
    }

    // Método otimizado para adição de elemento no
    public void adicionarElementoFinalVetor02(String elemento) throws Exception{
        if (this.tamanhoRealVetor < this.elementosVetor.length){
            this.elementosVetor[this.tamanhoRealVetor] = elemento;
            this.tamanhoRealVetor++;
        } else {
            throw new Exception("O vetor está cheio e não pode adicionar novos elementos");
        }
    }
    
    // Método opcional para adição de elemento no
    public boolean adicionarElementoFinalVetor03(String elemento) {
        this.aumentarCapacidadeVetor();
        if (this.tamanhoRealVetor < this.elementosVetor.length){
            this.elementosVetor[this.tamanhoRealVetor] = elemento;
            this.tamanhoRealVetor++;
            return true;
        } 
        return false;
    }

    public void adicionarElementoNaPosicaoIndicada(String elemento, int posicao){
        if (!(posicao >= 0 && posicao <= this.tamanhoRealVetor)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        this.aumentarCapacidadeVetor();

        for (int i = this.tamanhoRealVetor; i >= 0; i--) {
            this.elementosVetor[i+1] = this.elementosVetor[i];
            if (i == posicao){
                this.elementosVetor[i] = elemento;
                this.tamanhoRealVetor++;
                break;
            }
        }
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

    public String buscarElemento (int posicao){
        if (!(posicao > 0 && posicao < this.elementosVetor.length)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementosVetor[posicao];
    }

    public int buscarElemento (String elemento){
        for (int i = 0; i < this.tamanhoRealVetor; i++) {
            if (elementosVetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    private void aumentarCapacidadeVetor(){
        if (this.tamanhoRealVetor == this.elementosVetor.length){
            String[] novoVetor = new String[this.elementosVetor.length * 2];
            for (int i = 0; i < this.elementosVetor.length; i++){
                novoVetor[i] = elementosVetor[i];
            }
            this.elementosVetor = novoVetor;
            //System.out.println(this.elementosVetor.length);
        }
    }
}
