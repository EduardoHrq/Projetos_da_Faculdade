package Cardapio;


// Super classe produto com atributos e metodos
public abstract class Produtos {
    
	
	// -------------- ATRIBUTOS DOS PRODUTOS -----------------
	
    private int id;
    private String nome;
    private double preco;
    
    //---------------- METODOS GET E SET ---------------------
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome.substring(0, 1).toUpperCase().concat(nome.substring(1)); // Irá fazer com que a primeira letra seja sempre maiuscula 
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
    	return this.getId() + this.getNome() + this.getPreco();
    }

}
