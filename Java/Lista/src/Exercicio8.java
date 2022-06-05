package Ex8;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int numero[] = new int[20];
		int cont = 0;
		
		for(int i = 0; i < numero.length; i++) {
			numero[i] = input.nextInt();
			
			if(numero[i] > 8) {
				cont++;
			}
			
		}
		
		System.out.println("Números mariores que 8: " + cont);
		
		
		
		

		
	}

}
