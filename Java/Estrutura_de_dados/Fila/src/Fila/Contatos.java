/*
Eduardo Henrique Lima Silva - 0015751
Henrique Bitencourt Oliveira - 0015822
*/


package Fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Contatos {

    private Scanner entrada = new Scanner(System.in);
    private Queue<String> nomeContato = new LinkedList();
    private Queue<Integer> numeroContato = new LinkedList();

    public Contatos(){
        // utilizamos o metodo clear para que a fila comece vazia e com valores nulos.
        this.nomeContato.clear();
        this.numeroContato.clear();
    }

    public void menu(){
        System.out.printf("\n\n| Contatos do callcenter |\n\n 1 - Adicionar contato\n 2 - Proximo contato \n 3 - Sair\n\n Digite a sua opção -> ");
        //Foi criado a variavel option e utilizamos o Scanner para armazenar essa variavel para que o usario possa digitar as opções
        int option = entrada.nextInt();
        switch(option){
            case 1:
                this.adicionarContato();
                break;
            case 2:
                this.proximoContato();
                break;
            case 3:
                break;
            default:
                System.out.print("\n\n -->Digite uma opção valida!");
                //caso o usuario digite uma opção invalida retorna para o menu
                menu();
                
        }
    }

    public void adicionarContato(){
        System.out.print("\n\n --> Digite o nome do contato: ");
        nomeContato.add(entrada.next());

        //utilizando o Scanner para digitar o número do contato e adiciona-lo a fila.
        System.out.print("\n\n --> Digite o número do contato: ");
        numeroContato.add(entrada.nextInt());
        menu();
    }

    public void proximoContato(){

        if(nomeContato.peek() == null){
            //Caso não tenha mais contatos para mostrar para o usuario irá mostrar essa mensagem
            System.out.println("\n\n --> Não há mais contatos para telefonar!");
        } else {
            //Utilizando o metodo poll irá retornar o primeiro da fila e o remove em seguida
            System.out.println("\n\n --> Nome do contato: "+nomeContato.poll());
            System.out.println(" --> Número do contato: "+numeroContato.poll());
        }

        menu();
    }

    public static void main(String[] args){
        Contatos contatos = new Contatos();

        contatos.menu();
    }
}