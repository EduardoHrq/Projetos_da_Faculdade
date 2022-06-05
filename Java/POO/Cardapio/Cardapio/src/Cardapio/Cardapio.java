package Cardapio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.*;

public class Cardapio implements FuncCardapio {
    
	
	// ------------------- ATRIBUTOS ------------------------------
    ArrayList<Comidas> comidas = new ArrayList<Comidas>(); // Array list do tipo Comidas, a classe
    private ArrayList<Bebidas> bebidas = new ArrayList<Bebidas>(); // Array list do tipo Bebidas, a classe
    private int contador = 0; // Contador que definira o ID dos produtos

    
    // ----------------------- METODOS -------------------------------
    
    // Metodo para adicionar produtos
    @Override
    public void adicionarProduto() throws Exception{
    	
        String[] opc = {"Comidas", "Bebidas"}; // Array de String que irá ser usado como opções no JOptionPane
        
        // Entrada de dados com JOptionPane, com o menu de opções definido a cima, que tipo de produto será adicionado
        int escolha = JOptionPane.showOptionDialog(null, " ".repeat(30)+"Qual o produto?"+" ".repeat(50), "ADICIONAR NOVO PRODUTO", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        
        if(escolha != -1){
        	int qntd;
        	
        	
        	//Foi criado um try e catch para tratar o erro caso o usuario digite algum caracter que não seja um numero
        	try {
        		
        		//Entrada de dados com JOptionPane, e o que for digitado sera convertido de String para Integer
        		qntd = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos deseja adiconar?"));
        	}catch(Exception e){
        		JOptionPane.showMessageDialog(null, "O valor digitado não é um numero ou escolha invalida!", "ERRO", JOptionPane.ERROR_MESSAGE);
        		throw new InputMismatchException("Valor digitado não é um numero ou escolha invalida!");		
        	}
        	
        	
    		Queue<String> nome = new LinkedList<String>(); // Fila, que irá armazenar temporariamente o atributo nome
        	Queue<Double> preco = new LinkedList<Double>(); // Fila, que irá armazenar temporariamente o atributo preço
        	
        	// Estrutura de repetição, enquanto i for menor que qntd (quantidade de produtos que sera adicionada) executa o bloco
        	for(int i = 0; i < qntd; i++) {
        		
        		String auxName;
        		auxName = ((String)JOptionPane.showInputDialog(null, "Nome do produto", "NOME", JOptionPane.PLAIN_MESSAGE, null, null, null));
        		if(auxName.isEmpty()) {
        			JOptionPane.showMessageDialog(null, "Não digitou nada", "ERRO", JOptionPane.ERROR_MESSAGE);
        			throw new Exception("Não digitou nada!");
        		}else
        			nome.add(auxName);
        		
        		//Foi criado um try e catch para tratar o erro caso o usuario digite algum caracter que não seja um numero
        		try {
	        		String aux = (String)JOptionPane.showInputDialog(null, "Preço do produto", "PREÇO", JOptionPane.PLAIN_MESSAGE, null, null, null);
	        		preco.add(Double.parseDouble(aux.replaceAll(",", ".")));
        		}catch(Exception e){
        			JOptionPane.showMessageDialog(null, "O valor digitado não é um numero!", "ERRO", JOptionPane.ERROR_MESSAGE);
            		throw new InputMismatchException("Valor digitado não é um numero ou escolha invalida!");	
        		}
        		
        		if(escolha == 0)
        			
        			// Chamada do outro metodo adicionarProduto, que recebe como parametro uma instancia de Comidas
            		adicionarProduto(new Comidas(nome.poll(), preco.poll()));
        		
    	    	if(escolha == 1) {
    	    		
    	    		// Entrada de dados com JOptionPane, que nos dira se a bebida é alcoolica ou não
    	    		int alc = JOptionPane.showOptionDialog(null, "É alcoolico?", "TIPO DE BEBIDA", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE , null, null, null);
    	    		
    	    		// Foi ultilizado uma estrutura condicional para saber se a bebida é alcoolica ou não
    	    		if(alc == 0)
    	    			
    	    			// Chamada do outro metodo adicionarProduto, que recebe como parametro uma instancia de Bebidas
    	    			adicionarProduto(new Bebidas(nome.poll(), preco.poll(), true));
    	    		else 
    	    			
    	    			// Chamada do outro metodo adicionarProduto, que recebe como parametro uma instancia de Bebidas
    	    			adicionarProduto(new Bebidas(nome.poll(), preco.poll()));
    	    		
    	    	}
        	}
        		
        }
     
    }
    
    // Metodos que adicionará os atributos atravez de uma instancia no arraylist
    @Override
	public void adicionarProduto(Comidas c) {
		c.setId(contador);
		contador++;
    	comidas.add(c); // adicionando instancia ao array list
    }

    @Override
	public void adicionarProduto(Bebidas b) {
		b.setId(contador);
		contador++;
    	bebidas.add(b); // adicionando instancia ao array list
    }
	
	//Foi criado o metodo com retorno de String para que seja possivel mostrar Bebidas e Comidas no cardapio
	public String opcCardStr(int i) {
		String np;
		// o i que esta dentro do parametro representa o valor que será passado de acordo com a escolha do usuario ao olhar as opções no cardapio
		if(i == 1)
			np = "BEBIDAS";
		else
			np = "COMIDAS";
		
		String tudo = "<html>"+np+"<br>"+"_".repeat(60)+"<br>"+
				"ID > NOME > PREÇO<br>"+
				opcCardapio(i);
        return tudo;
    }

	// Metodo que retorna em String todos os objetos que estão dentro dos arraylists com o toString
	@Override
	public String opcCardapio(int i) {
		String tudo = "";
		
		// o i que esta dentro do parametro representa o valor que será passado de acordo com a escolha do usuario ao olhar as opções no cardapio
		if(i == 0) {
        	for (Comidas comidas : comidas) { //For-each, irá execultar para cada item dentro do array e passara o valor para comidas
        		tudo +="<br>" +  comidas.toString().replace(".", ",");
        	}
        } else if(i == 1) {
        	for (Bebidas bebidas : bebidas) {
        		tudo +="<br>" +  bebidas.toString().replace(".", ",");
        		if(bebidas.isAlcoolico())
        			tudo += "   >    Bebida alcoolica";
        	}
        }else {
        	for (Comidas comidas : comidas) {
        		tudo +="<br>" + comidas.toString().replace(".", ",");
        	}
        	
        	tudo += "<br><br><br>BEBIDAS<br>"+"_".repeat(60)+"<br>";
        	for (Bebidas bebidas : bebidas) {
        		tudo +="<br>" +  bebidas.toString().replace(".", ",");
        		if(bebidas.isAlcoolico())
        			tudo += "   >    Bebida alcoolica";
        	}
        }
		return tudo;
	}
}
