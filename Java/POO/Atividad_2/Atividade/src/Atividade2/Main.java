package Atividade2;

public class Main {
    public static void main(String[] args){
        Gato g1 = new Gato();
        g1.miar();
        g1.caminhar();

        System.out.println("");
        
        Cachorro c1 = new Cachorro();
        c1.latir();
        c1.caminhar();

        // ------------------------------

        Pessoa p1 = new Pobre();
        p1.trabalha();

        Pessoa p2 = new Rica();
        p2.fazCompras();

        Pessoa p3 = new Miseravel();
        p3.mendiga();

    }    	

  

}
