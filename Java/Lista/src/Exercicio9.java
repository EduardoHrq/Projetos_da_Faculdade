package Ex9;

import java.util.Scanner;

public class Exercicio9 {
	    
	    public static void main(String[] args){
	        
	        Scanner input = new Scanner(System.in);
	        
	        String situacao[] = new String[5];
	        int cont = 0, cont1 = 0;
	        
	        String nomeFuncionario[] = new String[5];
	        int tempoFuncionario[] = new int[5];
	        
	        for(int i = 0; i < nomeFuncionario.length; i++){
	            
	            System.out.print("Digite o nome do funcionario: ");
	            nomeFuncionario[i] = input.next();
	            
	            System.out.print("Informe o tempo de serviço: ");
	            tempoFuncionario[i] = input.nextInt();
	            
	            if(tempoFuncionario[i] > 12){
	                situacao[cont] = "Tem direito a férias";
	                cont++;
	                cont1++;
	            } else {
	                situacao[cont] = "Não tem direito a férias";
	                cont++;
	            }
	            
	            System.out.println("");
	        }
	        
	        
	        System.out.printf("\n  %-3s %-13s %-18s %s", "|", "NOME", "TEMPO", "SITUAÇÃO");
	        for(int i = 0; i < situacao.length; i++){
	            
	            System.out.printf("\n  %-3s %-13s %-3s %-8s %-5s %s", "|", nomeFuncionario[i], tempoFuncionario[i], "Meses", "->", situacao[i]);
	            
	        }
	        
	        System.out.println("\n\n" + cont1 + " Funcionarios tem direito a ferias!");
	    }

	
}
