package Atividade1;

// criamos a classe assistente que extende a classe funcionario
public abstract class Assistente extends Funcionario {

    // Construtor que já define que todos os assistentes tem um salario de 5000
    public Assistente(){
        this.setSalario(5000);    
    }

    // metodo que imprime os dado basicos do assistente
    public String exibirDados(){ 
        return "\n\n O nome do/a Assistente é " + this.getNome() + 
        "\n Sua Matricula é: " + this.getMatricula() +
        "\n Salario: " + this.getSalario() + "\n\n";
    }

}
