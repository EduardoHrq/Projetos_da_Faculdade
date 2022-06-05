package Atividade2;


public class Rica extends Pessoa{
    
    private double dinheiro;

    public Rica(){
        System.out.printf("\n Quanto de dinheiro possui para as compras: ");
        this.dinheiro = entrada.nextInt();
    }

    public void fazCompras(){
        System.out.printf("\n Tem " + this.dinheiro + "para suas compras hoje");

    }

}
