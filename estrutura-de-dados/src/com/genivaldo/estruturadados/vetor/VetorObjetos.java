package com.genivaldo.estruturadados.vetor;

public class VetorObjetos {

    private Object[] elementosVetor;
    private int tamanhoRealVetor;

    public VetorObjetos(int capacidade){
        this.elementosVetor = new Object[capacidade];
        this.tamanhoRealVetor = 0;
    }

    // Método não otimizado para checar as posicições vazias de um vetor
    public void adicionarElementoFinalVetor01(Object elemento){
        for (int i = 0; i < this.elementosVetor.length; i++) {
            if (this.elementosVetor[i] == null){
                this.elementosVetor[i] = elemento;
                break;
            }
        }
    }

    // Método otimizado para adição de elemento no
    public void adicionarElementoFinalVetor02(Object elemento) throws Exception{
        if (this.tamanhoRealVetor < this.elementosVetor.length){
            this.elementosVetor[this.tamanhoRealVetor] = elemento;
            this.tamanhoRealVetor++;
        } else {
            throw new Exception("O vetor está cheio e não pode adicionar novos elementos");
        }
    }
    
    // Método opcional para adição de elemento no
    public boolean adicionarElementoFinalVetor03(Object elemento) {
        this.aumentarCapacidadeVetor();
        if (this.tamanhoRealVetor < this.elementosVetor.length){
            this.elementosVetor[this.tamanhoRealVetor] = elemento;
            this.tamanhoRealVetor++;
            return true;
        } 
        return false;
    }

    public void adicionarElementoNaPosicaoIndicada(Object elemento, int posicao){
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

    public void removerElementoNaPosicaoIndicada(int posicao){
        if (!(posicao >= 0 && posicao <= this.tamanhoRealVetor)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        for (int i = posicao; i < this.tamanhoRealVetor -1; i++) {
            this.elementosVetor[i] = this.elementosVetor[i+1];
        }
        this.tamanhoRealVetor --;
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

    public Object buscarElemento (int posicao){
        if (!(posicao > 0 && posicao < this.elementosVetor.length)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementosVetor[posicao];
    }

    public int buscarElemento (Object elemento){
        for (int i = 0; i < this.tamanhoRealVetor; i++) {
            if (elementosVetor[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    private void aumentarCapacidadeVetor(){
        if (this.tamanhoRealVetor == this.elementosVetor.length){
            Object[] novoVetor = new Object[this.elementosVetor.length * 2];
            for (int i = 0; i < this.elementosVetor.length; i++){
                novoVetor[i] = elementosVetor[i];
            }
            this.elementosVetor = novoVetor;
            //System.out.println(this.elementosVetor.length);
        }
    }

    private void diminuirCapacidadeVetor(){
        if (this.tamanhoRealVetor < this.elementosVetor.length){
            Object[] novoVetor = new String[this.tamanhoRealVetor - 1];
            for (int i = 0; i < novoVetor.length; i++){
                novoVetor[i] = elementosVetor[i];
                if (i == (novoVetor.length - 1)) { 
                    break;
                }
            }
            this.elementosVetor = novoVetor;
            //System.out.println(this.elementosVetor.length);
        }
    }
}

