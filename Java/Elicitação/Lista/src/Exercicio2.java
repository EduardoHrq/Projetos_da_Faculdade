
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String nome[] = new String[3];
		String cidade;
		int endereco[] = new int[2];
		String numero;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		nome[0] = input.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		nome[1] = input.nextLine();
		
		nome[2] = nome[0] + " " + nome[1];
		
		System.out.println("Digite o seu endereço: ");
		System.out.print("Cidade: ");
		cidade = input.nextLine();
		
		System.out.print("Quadra: ");
		endereco[0] = input.nextInt();
		
		System.out.print("Lote: ");
		endereco[1] = input.nextInt();
		
		System.out.print("Informe o seu número: ");
		numero = input.next();
		
		System.out.printf("\n\n%s. Mora na cidade %s, Quadra %s, lote %s. Telefone: %s", 
				nome[2], cidade, endereco[0], endereco[1], numero);
		
	}
	
}
