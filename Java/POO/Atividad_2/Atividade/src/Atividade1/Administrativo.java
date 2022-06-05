package Atividade1;

// Herda e extende a classe assistente
public class Administrativo extends Assistente{
    
    //Construtor com parametros para nome e matricula
    public Administrativo(String nome, int matricula){
        this.setNome(nome);
        this.setMatricula(matricula);

        // Ira perguntar ao usuario qual o turno do assistente administrativo 
        System.out.println("\n\n Qual o seu turno? \n D - Diurno\n N - Noturno\n --> ");

        // condicional switch que de acordo com a escolha irá definir o salario do assistente
        switch(entrada.next().toLowerCase()){
            case "d":
                this.setSalario(this.getSalario());
                break;
            case "n":
                this.setSalario(this.getSalario() + 500);
                break;
            default:
                System.out.println("\n\n Escolha invalida \n\n");
        }

        
    }

}
