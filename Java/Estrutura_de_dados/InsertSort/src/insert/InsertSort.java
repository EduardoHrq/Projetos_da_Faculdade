package insert;

public class InsertSort {

	// método que permite ordenar o vetor de inteiros
		  // usando a ordenação Insertion Sort
		  public static void insertionSort(int[] vetor){
		    // percorre todos os elementos do vetor começando
		    // pelo segundo elemento
		    for(int i = 1; i < vetor.length; i++){
		      int atual = vetor[i]; // o valor atual a ser inserido
		      // começa a comparar com a célula à esquerda de i
		      int j = i - 1;
		       
		      // enquanto vetor[j] estiver fora de ordem em relação
		      // a atual
		      while((j >= 0) && (vetor[j] > atual)){
		        // movemos vetor[j] para a direita e decrementamos j
		        vetor[j + 1] = vetor[j];
		        j--;
		      }
		       
		      // colocamos atual em seu devido lugar
		      vetor[j + 1] = atual;
		    }
		  }  
		     
		  public static void main(String args[]){
		    // vamos criar um vetor com 9 elementos
		    int valores[] = {4, 6, 2, 8, 1, 9, 3, 0, 11};
		     
		    // exibimos o vetor na ordem original
		    System.out.println("Ordem original:\n");
		    for(int i = 0; i < valores.length; i++){
		      System.out.print(valores[i] + "  ");  
		    }
		     
		    // vamos ordenar o vetor agora
		    insertionSort(valores);
		     
		    // exibimos o vetor ordenado
		    System.out.println("\n\nOrdenado:\n");
		    for(int i = 0; i < valores.length; i++){
		      System.out.print(valores[i] + "  ");  
		    }
		  }
}
