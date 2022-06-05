package Atividade3;

public class VIP extends Ingresso {
    
    // valor adicional pelo VIP
    public double adicional = 50;

    // construtor que já inicia colocando o valor adicional no preço
    public VIP(){
        this.setValor(this.getValor() + adicional);
    }

    public void IngressoVIP(){
        System.out.println("\n O Ingresso selecionado foi o VIP, e seu valor é " + this.getValor());
    }

}
