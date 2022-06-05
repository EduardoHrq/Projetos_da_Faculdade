
public class TestarLivros {

	public static void main(String[] args) {
		Livro livrofavorito = new Livro();
		
		livrofavorito.setTitulo("O pequeno Príncipe");
		livrofavorito.setQtdPaginas(98);
		System.out.println("O livro " + livrofavorito.getTitulo() + 
				" possui " + livrofavorito.getQtdPaginas() + " páginas.");
		
		livrofavorito.setPaginasLidas(20);
		livrofavorito.verificarProgresso();
		livrofavorito.setPaginasLidas(50);
		livrofavorito.verificarProgresso();
		
		}
	}
	
