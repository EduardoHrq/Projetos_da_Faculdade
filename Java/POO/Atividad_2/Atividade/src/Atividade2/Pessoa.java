package Atividade2;

import java.util.Scanner;

public abstract class Pessoa {
    
    private String nome;
    private int idade;
    Scanner entrada = new Scanner(System.in);
    
    public Pessoa(){
        System.out.printf("\n Digite seu nome: ");
        this.setNome(entrada.next());
        System.out.printf("\n Digite sua idade: ");
        this.setIdade(entrada.nextInt());
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }


    public int getIdade(){
        return this.idade;
    }
    public String getNome(){
        return this.nome;
    }

    public void trabalha(){

    }

    public void fazCompras() {
    }

    public void mendiga() {
    }
}
