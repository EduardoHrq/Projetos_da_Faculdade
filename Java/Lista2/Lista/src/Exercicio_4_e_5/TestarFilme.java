package Exercicio4;

public class TestarFilme {
    
    public static void main(String[] args){
        
       Filmes filme1 = new Filmes();
    
        filme1.setTitulo("Os Vigadores 3");
        filme1.setDuracaoEmMinutos(142);
        
        filme1.exibirDuracaoEmHoras();
        
        //-------------------------------------------------
        
        Filmes filme2 = new Filmes();
        
        filme2.setTitulo("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos(93);
        
        filme2.exibirDuracaoEmHoras();
        
        
        System.out.printf("Os filmes em cartaz são %s e %s", filme1.getTitulo(), filme2.getTitulo());
    }
}
