
public class TestarLivros {

	public static void main(String[] args) {
		Livro livrofavorito = new Livro();
		
		livrofavorito.setTitulo("O pequeno Pr�ncipe");
		livrofavorito.setQtdPaginas(98);
		System.out.println("O livro " + livrofavorito.getTitulo() + 
				" possui " + livrofavorito.getQtdPaginas() + " p�ginas.");
		
		livrofavorito.setPaginasLidas(20);
		livrofavorito.verificarProgresso();
		livrofavorito.setPaginasLidas(50);
		livrofavorito.verificarProgresso();
		
		}
	}
	
