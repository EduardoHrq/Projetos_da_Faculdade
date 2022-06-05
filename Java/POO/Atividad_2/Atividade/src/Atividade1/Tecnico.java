package Atividade1;

// Herda e extende a classe assistente
public class Tecnico extends Assistente{
    
// Construtor com parametros para nome e matricula e um aumento no salario
    public Tecnico(String nome, int matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario(this.getSalario() + 1000);
    }

}
