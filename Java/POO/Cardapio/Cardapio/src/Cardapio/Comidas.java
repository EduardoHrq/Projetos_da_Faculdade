package Cardapio;

public class Comidas extends Produtos{
    
	
	// Construtor 
    public Comidas(String nome, double preco){

        this.setNome(nome);
        this.setPreco(preco);
    }

    
    // Metodo toString com retorno de uma String que irá estruturar a saida do objeto
    @Override
    public String toString() {
        return this.getId() + " - " + this.getNome() + " | R$ " + String.format("%.2f", this.getPreco());
    }
}
