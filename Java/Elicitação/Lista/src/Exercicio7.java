import java.util.Scanner;

public class Exercicio7 {
	public static void main (String [] args){
		int num[]= new int[10];
		
		Scanner input=new Scanner (System.in);
		System.out.println("Digite 10 numeros:");
		for (int i = 0; i<num.length; i++) {
			num[i] = input.nextInt();
			
		}
		
		int i = 0, soma = 0;
		do {
			soma += num[i];
			i++;
		}while(i < num.length);
	System.out.println("a soma dos numeros são:"+ soma);
	
	}
	
}
