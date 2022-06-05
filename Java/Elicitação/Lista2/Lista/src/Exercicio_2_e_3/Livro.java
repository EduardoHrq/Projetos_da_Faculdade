public class Livro {
	private String titulo;
	private int qtdPaginas;
	private int paginasLidas;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getPaginasLidas() {
		return paginasLidas;
	}
	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	
	public void verificarProgresso() {
		System.out.printf("Você já leu %s por cento do livro. " , 
				paginasLidas * 100 / qtdPaginas);
		
	}
	
}
