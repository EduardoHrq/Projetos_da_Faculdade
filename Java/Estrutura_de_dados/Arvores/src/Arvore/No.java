package Arvore;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class No {
	// Instanciando Scanner 
	Scanner entrada = new Scanner(System.in);
	private int valor;
	private No noEsquerda, noDireita;
	private int nivel;
	private int nos = 0;
	
	public No(int valor) {
		this.valor = valor;
	}
	public No() {
		menu();
	}

	//foi criado o menu utilizando Switch case
	public void menu(){
		int qntd;
		System.out.printf("\n\n\n%10sMENU\n\n 1 - Adicionar nós\n 2 - Imprimir arvore\n"+
			" 3 - Detalhes da arvore\n 4 - Sair\n\n --> ", "");
		
		switch(entrada.nextInt()){
			case 1:
				System.out.printf("\n\n Quantos nós deseja adicionar a arvore?\n\n --> ");
				qntd = entrada.nextInt();
				nos += qntd;
				for(int i = 0; i < qntd; i++){
					System.out.printf("\n Valor %-3s ->%3s", i+1, "");
					this.inserir(entrada.nextInt());
				}
				menu();
				break;
			case 2:
				if(raiz != null){
					System.out.printf("\n\n\n%11.5sIMPRESSÕES\n\n %-15s|%3s2 - Ordem\n"+ 
					" %-15s|%3s4 - PosOrdem\n\n --> ", "", "1 - Nivel", "", "3 - PreOrdem", "");
					
					//aqui foi implementado as opções de nivel, ordem, preordem e posordem da arvore. 
					switch(entrada.nextInt()){
						case 1:
							this.nivel(raiz);
							break;
						case 2:
							this.ordem(raiz);
							break;
						case 3:
							this.preordem(raiz);
							break;
						case 4:
							this.posordem(raiz);
							break;
						default:
							System.out.println("\n Escolha invalida");
					}
				} else{
					System.out.println("\nA Raiz da arvore é nula");
				}
				menu();
				break;
			case 3:
				if(raiz != null){
					if(this.nos == 1){
						System.out.println("\n * A arvore é de nivel "+ this.nivel);
					}else{
						System.out.println("\n * A arvore é de nivel "+ (this.nivel + 1));
					}
					System.out.println("\n * A arvore é de ordem 2");
					System.out.println("\n * A arvore possui "+ this.nos+ " nodo(s)");
				} else{
					System.out.println("\nA Raiz da arvore é nula");
				}
				menu();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("\n Escolha invalida");
		}
		menu();
	}
	
	public No raiz;
	
	public void inserir(int valor) {
		inserir(raiz, valor);
	}
	int cont = 0;
	public void inserir(No node, int valor) {
		if(node == null) {
			System.out.println("Raiz - " + valor);
			
			raiz = new No(valor);
			
		} else {
			if(valor < node.valor) {
				if(node.noEsquerda != null) {
					this.nivel +=  1;
					inserir(node.noEsquerda, valor);
				} else {
					System.out.println("Inserindo " + valor + " a esquerda de " + node.valor);
					node.noEsquerda = new No(valor);
				}
			} else {
				if(node.noDireita != null) {
					this.nivel +=  1;
					inserir(node.noDireita, valor);
				} else {
					System.out.println("Inserindo " + valor + " a direita de " + node.valor);
					node.noDireita = new No(valor);
				}
			}
		}
	}
//	Executa-se a aÃ§Ã£o a ser realizada Recursivamente percorre-se a subÃ¡rvore esquerda
//	Recursivamente percorre-se a subarvore direita
	public void preordem(No node) {
		if(node != null) {
			System.out.print(node.valor + ", ");
			preordem(node.noEsquerda);
			preordem(node.noDireita);
		}
	}
	
//	Recursivamente percorre-se a subarvore esquerda
//	Recursivamente percorre-se a subarvore direita
//	Executa-se a aÃ§Ã£o a ser realizada
	public void posordem(No node) {
		if(node != null) {
			posordem(node.noEsquerda);
			posordem(node.noDireita);
			System.out.print(node.valor + ", ");
		}
	}
//	Recursivamente percorre-se a subarvore esquerda
//	Executa-se a aÃ§Ã£o a ser realizada
//	Recursivamente percorre-se a subarvore direita
	public void ordem(No node) {
		if(node != null) {
			ordem(node.noEsquerda);
			System.out.print(node.valor + ", ");
			ordem(node.noDireita);
		}
	}
	
//	Nesse metodo ele esta¡ printando nivel por nivel
	public void nivel(No node) {
		if(node == null) {
			System.out.println("Fila não existente");
		} else {
			Deque<No> fila = new ArrayDeque<>();
			fila.add(node);
			while(!fila.isEmpty()) {
				No atual = fila.removeFirst();
				
				System.out.print(atual.valor + ", ");
				if(atual.noEsquerda != null) {
					fila.add(atual.noEsquerda);
				}
				if(atual.noDireita != null) {
					fila.add(atual.noDireita);
				}
			}
		}
	}
	
	public static void main (String[] args) {

		No arvore = new No();

	}
}