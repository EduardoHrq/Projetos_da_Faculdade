package Atividade1;

import java.util.Scanner;

// Super classe funcionario
public abstract class Funcionario {
    
    //instancia de um Scanner
    Scanner entrada = new Scanner(System.in);

    // atributos de funcionario
    private String nome;
    private double salario;
    private int matricula;


    // --------------- metodos get e set ----------------

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int numeros){
        this.matricula = numeros;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSalario(double quantia){
        this.salario = quantia;
    }

    public double getSalario(){
        return this.salario;
    }


    //metodo abstrato, para definir o seu bloco nas sub classes
    public abstract String exibirDados();
}
