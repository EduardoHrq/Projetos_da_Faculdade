import java.util.Scanner;

public class Exercicio3 {

	public static void main (String [] args){
		String sexo;
        Scanner input = new Scanner (System.in);
        
        System.out.println("digite o seu sexo (M/F): ");
        
        sexo = input.nextLine();
        switch (sexo.toUpperCase()){
            case "M":
                System.out.println("Seja bem-vindo senhor!");
                break;
            case "F":
                System.out.println("Seja bem-vindo senhora!");
                break;

        }

    }

}
