package Atividade3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Ingresso ingresso = new Ingresso();
        ingresso.imprimeValor();
        System.out.printf("\n\nQual ingresso deseja comprar:\n\n 1 - Normal\n 2 - VIP (+ R$ 50)\n\n -->");
        switch(entrada.nextInt()){
            case 1:
                Normal ingressoN = new Normal();
                ingressoN.ingressoNormal();
                break;
            case 2:
                VIP ingressoV = new VIP();
                ingressoV.IngressoVIP();
                System.out.printf("\n\nQual ingresso deseja comprar:\n\n"+
                    " 1 - Camarote Superior\n 2 - Camarote Inferior\n\n -->");
                if(entrada.nextInt() == 1){
                    CamaroteSuperior ivcs = new CamaroteSuperior();
                    ivcs.Camarote();
                } else{
                    CamaroteInferior ivci = new CamaroteInferior();
                    ivci.Camarote();
                }
                break;
            default:
                break;
        }
    }

}
