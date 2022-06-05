package Atividade1;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, int matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario(6000);
    }

    public String exibirDados(){ 
        return "\n\n O nome do Gerente é " + this.getNome() + "\n Sua Matricula é: " + this.getMatricula()
        + "\n Salario: " + this.getSalario() + "\n\n";
    }
    
}
