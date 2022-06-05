package Exercicio1;

public class Funcionario {
	
	//------------------------- ATRIBUTOS ------------------------------
	
    public String nome;
    public String sobrenome;
    public int horasTrabalhadas;
    public float valorPorHora;

    //--------------------------- METODOS ------------------------------

    void nomeCompleto () {

        System.out.println("Nome completo: " + nome + " " + sobrenome);
    }

    void calcularSalario () {

        System.out.println("\nO salário de " + nome + " é R$ " + horasTrabalhadas*valorPorHora);

    }

    void incrementarHoras (int i) {

        horasTrabalhadas += i;
    }
    
    //-------------------------------------------------------------------
    
    public static void main(String[] args){
    	
        Funcionario f1 = new Funcionario();
        
        f1.nome = "Pedro";
        f1.sobrenome = "Antonio";
        f1.horasTrabalhadas = 15;
        f1.valorPorHora = (float) 32.50;
        
        f1.nomeCompleto();
        f1.calcularSalario();
        f1.incrementarHoras(8);
        f1.calcularSalario();
    }
    
}
