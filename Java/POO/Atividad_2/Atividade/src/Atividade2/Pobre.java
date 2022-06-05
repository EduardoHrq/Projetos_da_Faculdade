package Atividade2;

public class Pobre extends Pessoa{

    public Pobre(){
        
    }
    
    @Override
    public void trabalha(){
        System.out.println(this.getNome() + " Plantão hoje, inicio as 6:00 horas");
    }

}
