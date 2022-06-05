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
	
	// Foram criadas duas estruturas de dados, do tipo pilha, uma que irá armazenar as tarefas
	// a outra irá auxilia no manuzeio das informações
	private Stack<String> auxTarefa = new Stack<String>();
	private Stack<String> tarefa = new Stack<String>();
	
	public Pilha(){
		this.tarefa.clear();
		this.auxTarefa.clear();
		menu();
	}
	
	// Metodo sem retorno que gera um pequeno menu e guiará o usuário de acordo com a sua escolha
	private void menu(){
		
		// Saida grafica do menu
		System.out.printf("\n%-4s%-13s%-4s%s", "__", "__", "__", "__");
		System.out.printf("\n%-7s TAREFAS %7s\n\n"
				+ "( 1 ) - Inserir tarefa\n( 2 ) - Proxima tarefa \n( 3 ) - Tarefas\n( 4 ) - Sair"
				+ "\n\n Digite a sua opção -> ", "|", "|");
		
		// Entrada de dados do usuario, este de acordo com o menu irá direcionar o codigo
		int option = entrada.nextInt();
		System.out.printf("%s", "------------------------");
		
		// Estrura de decisão ou condiocional simples, este de acordo com o dados dentro da variavel "option"
		// irá execultar outro metodo
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
				System.out.print("\n\n\n\n !!!!!!!! Digite uma opção valida !!!!!!!! \n\n\n\n");
				menu();
			
		}
	}
	
	// Metodo sem retorno para adicionar tarefas na aplicação
	private void adicionarTarefa(){
		
		// Saida perguntando quantas tarefas o usuario deseja adicionar, logo abaixo uma entrada de dados para que seja possivel
		System.out.print("\n\n ----> Quantas tarefas deseja adicionar? ");
		int inserirQnt = entrada.nextInt();
		
		// Estrutura de  repetição, que de acordo com a quantidade de tarefas que o usuario deseja cadastrar irá repetir o bloco
		for(int i = 0; i < inserirQnt; i++) {
			// Saida perguntando qual a tarefa que irá adicionar
			System.out.print("\n\n --> Qual tarefa deseja inserir: ");
			// Entrada de dados, em seguida o dado digitado pelo usuario será adicionado a primeira posição ou nas posições seguintes
			tarefa.push(entrada.next());
		}
	
		// ao fim do bloco do metodo, o usuário será redirecionado novamente ao menu para continuar utilizando a aplicação
		menu();
	}
	
	// Metodo sem retorno onde o usuario podera selecionar uma tarefa e marcala como concluida e ver qual será a proxima
	private void proximoContato(){
		// Caso a pilha ainda esteja vazia ou as tarefas já tenham sido concluidas 
		if(tarefa.size() == 0){
			System.out.println("\n\n --> Não há mais tarefas!");
		} else {
			System.out.print("\n Qual tarefa deseja realizar? (digite o seu indice) -> ");

			// Atravez de uma saida, foi solicitada uma tarefa, informada por seu indice, opção "3" no menu mostra este
			// tendo este dado inciamos um bloco de repetição, enquanto o tamanho da pilha for menor ou igual repita
			for(int tarefaNum = entrada.nextInt(); tarefaNum <= tarefa.size();) {
				/* Quando o tamanho da pilha e o numero de indice informado forem iguais, irá mostrar a tarefa escolhida 
				 * ao usuario e perguntar se o mesmo quer marca-la como concluida. */
				if(this.tarefa.size() == tarefaNum) {
					System.out.println("\n\n --> Tarefa: "+this.tarefa.peek());
					System.out.println("Deseja marcar esta tarefa como concluida? (Sim = 0/Não = 1) - ");
					if(entrada.nextInt() == 0) {
						this.tarefa.pop();
					}else {
						break;
					}
				// Enquanto o tamanho e o indice não forem iguais, o valores que estão na parte de cima da pilha
				// São armazenados em outra pilha que irá auxiliar no manuzeio das informações
				}else {
					this.auxTarefa.push(tarefa.pop());
				}

			}

		}
		/* Ao fim do primeiro bloco de repetição, iniciamos outro para realocar as informações na pilha principal
		 * neste, enquanto o tamanho da pilhar auxiliar for maior que 0 executará*/
		while(auxTarefa.size() > 0) {
			this.tarefa.push(this.auxTarefa.pop());
		}
		
		/* Aqui mostrará ao usuario a proxima tarefa, uma ajuda ao usuario, caso não haja mais tarefa ele 
		 * tambem informará*/
		if(tarefa.size() != 0) {
			System.out.println("\n\n --> Próxima tarefa: "+this.tarefa.peek());
		} else {
			System.out.println("\n\n --> Não há mais tarefas!");
		}
		
		// Ao fim do bloco deste metodo o mesmo levará o usuario de volta ao menu
		menu();
	}
	
	/* Metodo sem retorno que mostrar aos usuário as tarefas que foram inseridas, bem como os seus indices*/
	private void mostrarTarefas() {
		// Caso o tamanho da pilha seja 0, ou seja, não dados na pilha, então executa o bloco informando que não há tarefas
		if(this.tarefa.size() == 0) {
			System.out.println("\n\n --> Você não tem tarefas");
		}else {
			// Se houver tarefas, ele primeiro mostrará quantas 
			System.out.println("\n\n --> Você tem "+this.tarefa.size()+" tarefa(s) ainda pendente(s)");
			
			int sizeTarefa = this.tarefa.size();
			
			/* Para que seja possivel mostrar todas as tarefas e as suas respectivas posições na pilha 
			 * criamos uma estrutura de repetição para percorrer a pilha*/
			for(int cont1 = 0; cont1 < sizeTarefa; cont1++) {
				// enquanto a tarefa for maior ou igual a "1", em todas as repetições ele irá mostrar a posição e o nome da tarefa
				if(this.tarefa.size() >= 1) {
					System.out.printf("\n |%3s Tarefa [ %s ]: %-15s %s","",this.tarefa.size(),this.tarefa.peek(), "|");
					// Apos irá armazenar os valores na variavel auxiliar 
					this.auxTarefa.push(tarefa.pop());
				}
				// Ao fim, quando o tamanho da pilha chegar a 0, ele irá realocar todos os dados na pilha principal, atravez do bloco de repetição abaixo
				if(this.tarefa.size() == 0) {
					for(int cont2 = 0; cont2 < sizeTarefa; cont2++) {
						this.tarefa.push(this.auxTarefa.pop());
					}
				}
			}
		}
		
		// Ao fim deste bloco o usuario é redicionado novamente ao menu
		menu();
	}

	// metodo main do código
	public static void main(String[] args){
		// instancia da classe pilha, para o objeto tarefas
		Pilha tarefas = new Pilha();
	}
}