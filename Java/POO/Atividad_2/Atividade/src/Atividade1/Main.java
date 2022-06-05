package Atividade1;

public class Main {
    
    public static void main(String[] args){
        // instanciando um tecnico do tipo funcionario
        Funcionario assTecnico = new Tecnico("claudio", 54892);
        //printando os seu dados
        System.out.println(assTecnico.exibirDados());

        // instanciando um assistente administrativo do tipo funcionario
        Funcionario assAdministrativo = new Administrativo("claudia", 54822232);
        //printando os seu dados
        System.out.println(assAdministrativo.exibirDados());

        // instanciando um gerente do tipo funcionario
        Funcionario gerente = new Gerente("claudia", 54822232);
        //printando os seu dados
        System.out.println(gerente.exibirDados());
    }

}
