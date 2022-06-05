package Cardapio;

// Interface de cardapio funções que serão implementadas na classe Cardapio
public interface FuncCardapio {

	public abstract void adicionarProduto() throws Exception;
	
	public abstract void adicionarProduto(Bebidas b);
	
	public abstract void adicionarProduto(Comidas c);
	
	public abstract String opcCardapio(int i);
	
}
