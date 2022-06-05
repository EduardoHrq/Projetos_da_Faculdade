package Atividade2;

public class Animal{

	//atributos do tipo String
    private static String nome;
    private static String raca;
     
     public Animal () {
	}
  // foi criado os construtores que recebe nome e raça
    public Animal (String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    } 
   
    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getRaca(){ 
        return raca;
    }
    public void setRaca (String raca){
        this.raca = raca;
    }

    public void latir() {
	}
        
    
    public void caminhar() {
	}
    

    public static void main (String []args) {
	
    	//Chamando a classe gato e cachorro
    	
    	Gato g1 = new Gato();
    	g1.miar();
    	
    	Cachorro c1 = new Cachorro();
    	c1.latir();
    	
    	
    	
    	
    	
	}


}