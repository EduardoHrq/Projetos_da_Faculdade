package Exercicio4;

public class Filmes {
    	
    //--------------------------------------------------------------
	
    private String titulo = "a";
    private int duracaoEmMinutos = 194;

    //-------------------------------------------------------------
	
    public String getTitulo() {
	return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getDuracaoEmMinutos() {
	return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
	
    //-------------------------------------------------------------
        
    public void exibirDuracaoEmHoras(){ 
        System.out.printf("\nO filme, %s, possui %s horas e %s minutos de duração\n",
            this.getTitulo(), this.getDuracaoEmMinutos()/60, this.getDuracaoEmMinutos()%60);
    }
    
}
