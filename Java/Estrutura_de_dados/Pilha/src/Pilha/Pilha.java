/*
Eduardo Henrique Lima Silva - 0015751
Henrique Bitencourt Oliveira - 0015822
*/


package Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {
	
	// Instaciamos um scanner para futuramente utilizar ou solicitar um entrada de dados
	private Scanner entrada = new Scanner(System.in);
	
	// Foram criadas duas estruturas de dados, do tipo pilha, uma que ir� armazenar as tarefas
	// a outra ir� auxilia no manuzeio das informa��es
	private Stack<String> auxTarefa = new Stack<String>();
	private Stack<String> tarefa = new Stack<String>();
	
	public Pilha(){
		this.tarefa.clear();
		this.auxTarefa.clear();
		menu();
	}
	
	// Metodo sem retorno que gera um pequeno menu e guiar� o usu�rio de acordo com a sua escolha
	private void menu(){
		
		// Saida grafica do menu
		System.out.printf("\n%-4s%-13s%-4s%s", "__", "__", "__", "__");
		System.out.printf("\n%-7s TAREFAS %7s\n\n"
				+ "( 1 ) - Inserir tarefa\n( 2 ) - Proxima tarefa \n( 3 ) - Tarefas\n( 4 ) - Sair"
				+ "\n\n Digite a sua op��o -> ", "|", "|");
		
		// Entrada de dados do usuario, este de acordo com o menu ir� direcionar o codigo
		int option = entrada.nextInt();
		System.out.printf("%s", "------------------------");
		
		// Estrura de decis�o ou condiocional simples, este de acordo com o dados dentro da variavel "option"
		// ir� execultar outro metodo
		switch(option){
			case 1:
				this.adicionarTarefa();
				break;
			case 2:
				this.proximoContato();
				break;
			case 3:
				this.mostrarTarefas();
				break;
			case 4:
				System.out.printf("\n\n\n\n- %11s %11s", "FIM", "-");
				break;
			default:
				System.out.print("\n\n\n\n !!!!!!!! Digite uma op��o valida !!!!!!!! \n\n\n\n");
				menu();
			
		}
	}
	
	// Metodo sem retorno para adicionar tarefas na aplica��o
	private void adicionarTarefa(){
		
		// Saida perguntando quantas tarefas o usuario deseja adicionar, logo abaixo uma entrada de dados para que seja possivel
		System.out.print("\n\n ----> Quantas tarefas deseja adicionar? ");
		int inserirQnt = entrada.nextInt();
		
		// Estrutura de  repeti��o, que de acordo com a quantidade de tarefas que o usuario deseja cadastrar ir� repetir o bloco
		for(int i = 0; i < inserirQnt; i++) {
			// Saida perguntando qual a tarefa que ir� adicionar
			System.out.print("\n\n --> Qual tarefa deseja inserir: ");
			// Entrada de dados, em seguida o dado digitado pelo usuario ser� adicionado a primeira posi��o ou nas posi��es seguintes
			tarefa.push(entrada.next());
		}
	
		// ao fim do bloco do metodo, o usu�rio ser� redirecionado novamente ao menu para continuar utilizando a aplica��o
		menu();
	}
	
	// Metodo sem retorno onde o usuario podera selecionar uma tarefa e marcala como concluida e ver qual ser� a proxima
	private void proximoContato(){
		// Caso a pilha ainda esteja vazia ou as tarefas j� tenham sido concluidas 
		if(tarefa.size() == 0){
			System.out.println("\n\n --> N�o h� mais tarefas!");
		} else {
			System.out.print("\n Qual tarefa deseja realizar? (digite o seu indice) -> ");

			// Atravez de uma saida, foi solicitada uma tarefa, informada por seu indice, op��o "3" no menu mostra este
			// tendo este dado inciamos um bloco de repeti��o, enquanto o tamanho da pilha for menor ou igual repita
			for(int tarefaNum = entrada.nextInt(); tarefaNum <= tarefa.size();) {
				/* Quando o tamanho da pilha e o numero de indice informado forem iguais, ir� mostrar a tarefa escolhida 
				 * ao usuario e perguntar se o mesmo quer marca-la como concluida. */
				if(this.tarefa.size() == tarefaNum) {
					System.out.println("\n\n --> Tarefa: "+this.tarefa.peek());
					System.out.println("Deseja marcar esta tarefa como concluida? (Sim = 0/N�o = 1) - ");
					if(entrada.nextInt() == 0) {
						this.tarefa.pop();
					}else {
						break;
					}
				// Enquanto o tamanho e o indice n�o forem iguais, o valores que est�o na parte de cima da pilha
				// S�o armazenados em outra pilha que ir� auxiliar no manuzeio das informa��es
				}else {
					this.auxTarefa.push(tarefa.pop());
				}

			}

		}
		/* Ao fim do primeiro bloco de repeti��o, iniciamos outro para realocar as informa��es na pilha principal
		 * neste, enquanto o tamanho da pilhar auxiliar for maior que 0 executar�*/
		while(auxTarefa.size() > 0) {
			this.tarefa.push(this.auxTarefa.pop());
		}
		
		/* Aqui mostrar� ao usuario a proxima tarefa, uma ajuda ao usuario, caso n�o haja mais tarefa ele 
		 * tambem informar�*/
		if(tarefa.size() != 0) {
			System.out.println("\n\n --> Pr�xima tarefa: "+this.tarefa.peek());
		} else {
			System.out.println("\n\n --> N�o h� mais tarefas!");
		}
		
		// Ao fim do bloco deste metodo o mesmo levar� o usuario de volta ao menu
		menu();
	}
	
	/* Metodo sem retorno que mostrar aos usu�rio as tarefas que foram inseridas, bem como os seus indices*/
	private void mostrarTarefas() {
		// Caso o tamanho da pilha seja 0, ou seja, n�o dados na pilha, ent�o executa o bloco informando que n�o h� tarefas
		if(this.tarefa.size() == 0) {
			System.out.println("\n\n --> Voc� n�o tem tarefas");
		}else {
			// Se houver tarefas, ele primeiro mostrar� quantas 
			System.out.println("\n\n --> Voc� tem "+this.tarefa.size()+" tarefa(s) ainda pendente(s)");
			
			int sizeTarefa = this.tarefa.size();
			
			/* Para que seja possivel mostrar todas as tarefas e as suas respectivas posi��es na pilha 
			 * criamos uma estrutura de repeti��o para percorrer a pilha*/
			for(int cont1 = 0; cont1 < sizeTarefa; cont1++) {
				// enquanto a tarefa for maior ou igual a "1", em todas as repeti��es ele ir� mostrar a posi��o e o nome da tarefa
				if(this.tarefa.size() >= 1) {
					System.out.printf("\n |%3s Tarefa [ %s ]: %-15s %s","",this.tarefa.size(),this.tarefa.peek(), "|");
					// Apos ir� armazenar os valores na variavel auxiliar 
					this.auxTarefa.push(tarefa.pop());
				}
				// Ao fim, quando o tamanho da pilha chegar a 0, ele ir� realocar todos os dados na pilha principal, atravez do bloco de repeti��o abaixo
				if(this.tarefa.size() == 0) {
					for(int cont2 = 0; cont2 < sizeTarefa; cont2++) {
						this.tarefa.push(this.auxTarefa.pop());
					}
				}
			}
		}
		
		// Ao fim deste bloco o usuario � redicionado novamente ao menu
		menu();
	}

	// metodo main do c�digo
	public static void main(String[] args){
		// instancia da classe pilha, para o objeto tarefas
		Pilha tarefas = new Pilha();
	}
}