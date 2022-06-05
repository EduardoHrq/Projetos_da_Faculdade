package AtividadeHerança;

public class Novo extends Imovel{
	public float adicionarPreco;

	public float getAdicionarPreco() {
		return adicionarPreco;
	}

	//metodos para desconto no imovel novo
	public void setAdicionarPreco(float adicionarPreco) {
		this.adicionarPreco = adicionarPreco;
	}
	
	public void iAdicionarPreco(float preco) {
	
		this.adicionarPreco = preco*this.preco;	
	System.out.println("Valor:"+ (this.adicionarPreco+this.preco));
	
	}

}
