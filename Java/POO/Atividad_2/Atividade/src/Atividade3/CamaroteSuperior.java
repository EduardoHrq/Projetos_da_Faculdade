package Atividade3;

public class CamaroteSuperior extends VIP {
    
    public CamaroteSuperior(){
        this.adicional = 10;
        setValor(this.getValor() + adicional);
    }

    public void Camarote(){
        System.out.println("O valor do Ingresso VIP com acesso ao camarote Superior é " + this.getValor());
    }

}
