/*Dupla:
 * 	Eduardo Hnerique Lima Silva (2º Semestre, nº0015751)
 * 	João Pedro da Silva Guerath de Andrade (1º Semestre, nº0016375) 
 */

package Atividade;

import java.util.Scanner; // Importação do Scanner

public class Media{

	// Atributos
	float[] notas = new float[4]; // Array que vai alocar nota dos 4 bimestres
	private String materia;
	private float mediaRes;
	private boolean situacao;
	
	// Método construtor, que define a matéria como "Elicitação a programação"
	public Media() {
		this.setMateria("Elicitação a Programação");
	}
	
	// Getters e Setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// Método que esta calculando a média
	public void setMediaRes(float n1, float n2, float n3, float n4) {
		this.mediaRes = (n1+n2+n3+n4)/4;
	}
	
	public float getMediaRes() {
		return mediaRes;
	}
	
	// Método que retorna valor booleano, caso a nota for maior ou igual a 6 = true = aprovado, se não, false = reprovado
	public void setSituacao(float nota) {
		if(nota >= 6) {
			this.situacao = true;
		} else {
			this.situacao = false;
		}
	}
	
	public boolean getSituacao() {
		return situacao;
	}
	
	public float getNotas(int p) {
		return notas[p];
	}

	// Método que irá receber a notas digitadas pelo usuário e armazenar em um array
	int x = 0; // contador básico para o array
	public void setNotas(float notas) {
		if(notas >= 0) {
			this.notas[x] = notas;
			x++;
		}
	}
	
	// Método que retorna o estado atual de um objeto
	public void status() {
		System.out.println("\n----------------------------------------");
		System.out.println("\nMATÉRIA: " + this.getMateria() + "\n");
		
		int x = 1;
		for(int cont = 0; cont < 4; cont++) {
			System.out.println("Nota do "+ x + "º Bimestre: " + this.getNotas(cont));
			x++;
		}
	}
	
	public static void main(String[] args) {
		
		//  instanciando o objeto
		Media nt = new Media();
		
		// instanciando ou criando o Scanner
		Scanner nums = new Scanner(System.in);
				
		// Pequeno Cabeçalho
		System.out.println("\n-           Calculo de Média           -");
		System.out.println("----------------------------------------");
		
		// Entrada de dados, dados estão indo para um array, por isso a estrutura de repetição
		int x = 1; // Simples contador para os bimestres 
		for(int cont = 0; cont < 4; cont++) {
			System.out.print("Digite a nota do " + x +  "º bimestre: ");
			nt.setNotas(nums.nextFloat());
			x++;
		}
		
		// Estado atual em que o objeto se encontra, chamado atraves do método "status"
		nt.status();
		
		// Definindo atraves de parametros as notas ao método que irá realizar o calculo
		nt.setMediaRes(nt.getNotas(0), nt.getNotas(1), nt.getNotas(2), nt.getNotas(3));
		
		// Saida que irá mostra a média alcançada 
		System.out.println("\nA média é equivalente à " + nt.getMediaRes());
		
		// Mandando o valor da média atraves de um parametro ao método, que ira realizar um condicional e retornar um valor booleano
		nt.setSituacao(nt.getMediaRes());
		
		// Condicional que irá retornar ou sair se o aluno esta aprovado ou reprovado
		if(nt.getSituacao() == true) {
			System.out.println("\n========================================");
			System.out.println("      Situação do Aluno: APROVADO ");
			System.out.println("========================================");
			} else {
			System.out.println("\n========================================");
			System.out.println("      Situação do Aluno: REPROVADO ");
			System.out.println("========================================");
		}
		
	}
}
