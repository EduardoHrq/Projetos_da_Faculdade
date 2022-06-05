import java.util.Scanner;

public class Exercicio10 {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		int nota [] = new int [5];
		String Aluno[] = new String[4];
		
		int media = 0;
		
		
		for (int i=0; i < Aluno.length ; i++)
		{
		System.out.print("Digite o nome do aluno: ");
		Aluno [i] =input.next();
		
		System.out.print("Digite a nota do aluno: ");
		nota [i] =input.nextInt();
		
		System.out.print("\n");
		
		nota[4] += nota[i];
				
		}
		
		media=nota[4]/4;
		
		String fdps[]= new String[4];
		int c = 0;
		for(int i=0; i < Aluno.length; i++) {
			if (media<nota[i]) {
				fdps[c] = Aluno[i];
				c++;
			}
		}
		    
		 System.out.printf("\n\nMédia dos alunos: %d\n\n", media);
		 
		 System.out.print("Alunos com nota acima da média: ");
		 
		 for(int i = 0; i < c; i++) {
			 System.out.printf("\n%s",fdps[i]);
		 }
		 
		 
		 
}
}
