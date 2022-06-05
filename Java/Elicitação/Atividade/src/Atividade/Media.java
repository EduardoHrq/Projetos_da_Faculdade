/*Dupla:
 * 	Eduardo Hnerique Lima Silva (2� Semestre, n�0015751)
 * 	Jo�o Pedro da Silva Guerath de Andrade (1� Semestre, n�0016375) 
 */

package Atividade;

import java.util.Scanner; // Importa��o do Scanner

public class Media{

	// Atributos
	float[] notas = new float[4]; // Array que vai alocar nota dos 4 bimestres
	private String materia;
	private float mediaRes;
	private boolean situacao;
	
	// M�todo construtor, que define a mat�ria como "Elicita��o a programa��o"
	public Media() {
		this.setMateria("Elicita��o a Programa��o");
	}
	
	// Getters e Setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// M�todo que esta calculando a m�dia
	public void setMediaRes(float n1, float n2, float n3, float n4) {
		this.mediaRes = (n1+n2+n3+n4)/4;
	}
	
	public float getMediaRes() {
		return mediaRes;
	}
	
	// M�todo que retorna valor booleano, caso a nota for maior ou igual a 6 = true = aprovado, se n�o, false = reprovado
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

	// M�todo que ir� receber a notas digitadas pelo usu�rio e armazenar em um array
	int x = 0; // contador b�sico para o array
	public void setNotas(float notas) {
		if(notas >= 0) {
			this.notas[x] = notas;
			x++;
		}
	}
	
	// M�todo que retorna o estado atual de um objeto
	public void status() {
		System.out.println("\n----------------------------------------");
		System.out.println("\nMAT�RIA: " + this.getMateria() + "\n");
		
		int x = 1;
		for(int cont = 0; cont < 4; cont++) {
			System.out.println("Nota do "+ x + "� Bimestre: " + this.getNotas(cont));
			x++;
		}
	}
	
	public static void main(String[] args) {
		
		//  instanciando o objeto
		Media nt = new Media();
		
		// instanciando ou criando o Scanner
		Scanner nums = new Scanner(System.in);
				
		// Pequeno Cabe�alho
		System.out.println("\n-           Calculo de M�dia           -");
		System.out.println("----------------------------------------");
		
		// Entrada de dados, dados est�o indo para um array, por isso a estrutura de repeti��o
		int x = 1; // Simples contador para os bimestres 
		for(int cont = 0; cont < 4; cont++) {
			System.out.print("Digite a nota do " + x +  "� bimestre: ");
			nt.setNotas(nums.nextFloat());
			x++;
		}
		
		// Estado atual em que o objeto se encontra, chamado atraves do m�todo "status"
		nt.status();
		
		// Definindo atraves de parametros as notas ao m�todo que ir� realizar o calculo
		nt.setMediaRes(nt.getNotas(0), nt.getNotas(1), nt.getNotas(2), nt.getNotas(3));
		
		// Saida que ir� mostra a m�dia alcan�ada 
		System.out.println("\nA m�dia � equivalente � " + nt.getMediaRes());
		
		// Mandando o valor da m�dia atraves de um parametro ao m�todo, que ira realizar um condicional e retornar um valor booleano
		nt.setSituacao(nt.getMediaRes());
		
		// Condicional que ir� retornar ou sair se o aluno esta aprovado ou reprovado
		if(nt.getSituacao() == true) {
			System.out.println("\n========================================");
			System.out.println("      Situa��o do Aluno: APROVADO ");
			System.out.println("========================================");
			} else {
			System.out.println("\n========================================");
			System.out.println("      Situa��o do Aluno: REPROVADO ");
			System.out.println("========================================");
		}
		
	}
}
