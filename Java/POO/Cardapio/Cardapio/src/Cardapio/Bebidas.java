package Cardapio;


// Classe que representa um tipo de produto
public class Bebidas extends Produtos{

	
	// atributo do tipo booleano
    private boolean alcoolico;
    
    // Contrutor com 3 parametros, gerando uma sobrecarga
    public Bebidas(String nome, double preco, boolean alc){

        this.setNome(nome);
        this.setPreco(preco);
        this.setAlcoolico(alc);


    }
    
    // Construtor com 2 parametros
    public Bebidas(String nome, double preco){

        this.setNome(nome);
        this.setPreco(preco);
        this.setAlcoolico(false);


    }

    
    //----------------- METODO GET E SET ------------    
    public boolean isAlcoolico() {
        return alcoolico;
    }

    public void setAlcoolico(boolean alcoolico) {
        this.alcoolico = alcoolico;
    }

    
    // Metodo toString com retorno de uma String que irá estruturar a saida do objeto
    @Override
    public String toString() {
        return this.getId() + " - " + this.getNome() + " | R$ " + String.format("%.2f", this.getPreco()); 
        //															definindo que o double deve ter duas casa decimais apos a virgula
    }

}
