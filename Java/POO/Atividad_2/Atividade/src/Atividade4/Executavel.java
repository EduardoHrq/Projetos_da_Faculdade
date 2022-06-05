package AtividadeHerança;

import java.util.Scanner;

public class Executavel extends Imovel{
	public static void main(String[] args) {
		
		//Instanciado as classes
	    Scanner entrada = new Scanner(System.in);
	    Imovel imovel = new Imovel();
	    Novo novo = new Novo();
	    Velho velho = new Velho();
	   
	        System.out.println("Digite 1 para Imovel NOVO e 2 para Imovel VELHO");
	        int op;
	        op = entrada.nextInt();
	        
	        //criando as opçoes de imovel velho e novo
	        switch(op){
	            case 1:
	                novo.setAdicionarPreco(0.8f);
	                novo.setPreco(285000f);
	                novo.iAdicionarPreco(novo.getAdicionarPreco());
	                break;
	            case 2:
	                velho.setDescontoP(0.9f);
	                velho.setPreco(175000f);
	                velho.dPreco(velho.getDescontoP());
	                break;
	                
	                
	        }
	    }
}
	
