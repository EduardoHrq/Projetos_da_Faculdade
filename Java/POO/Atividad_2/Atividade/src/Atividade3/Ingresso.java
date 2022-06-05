package Atividade3;

import java.util.Scanner;

// Super classe
public class Ingresso {
    
    // atributos do ingresso e intancia de um scanner
    private double valor;
    Scanner entrada = new Scanner(System.in);

    // construtor que define o valor inicial do ingresso
    public Ingresso(){ 	
        this.setValor(30);

    }

    // ------------ metodos get e set --------------

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    // metodo que imprime o valor do ingresso
    public void imprimeValor(){
        System.out.println("\n O valor do ingresso é " + this.getValor());
    }

}
