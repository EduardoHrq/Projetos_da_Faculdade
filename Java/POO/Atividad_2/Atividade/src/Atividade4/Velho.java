package AtividadeHerança;

public class Velho extends Imovel {

	public float descontoP;

	public float getDescontoP() {
		return descontoP;
	}

	//metodos para desconto no imovel velho
	public void setDescontoP(float descontoP) {
		this.descontoP = descontoP;
	}
	
	
	public void dPreco (float preco) {
		this.descontoP = preco*this.preco;	
		System.out.println("Valor:"+ (this.descontoP +this.preco));
		
	}
		
	}


