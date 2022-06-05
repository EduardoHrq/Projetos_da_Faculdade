/*
Eduardo henrique Lima Silva - 0015751
Henrique Bitencourt Oliveira
*/

package Faculdade;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Universidade{

    // Atributos estruturados em filas e Array para o menu
    static String[] menu = {"Adicionar novo curso", "Mostrar Cursos", "Cursos", "Alunos", "Mostra Todos os Alunos","Mostrar disciplinas", "Sair"};
    static Queue<String> cursos = new LinkedList<String>();
    static Queue<String> pAux = new LinkedList<String>();

    protected static void menu(){
        // Menu com botões para o usuario escolher e direcionar o programa atraves do switch
        int opt = JOptionPane.showOptionDialog(null, 
            "Escolha uma opção:"
            , "Sistema Academico", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
    
        switch(opt){
            case 0:
                inserirCursos();
                break;
            case 1:
                mostrarCursos();
                break;
            case 2:
                Cursos.cursos();
                break;
            case 3:
                Aluno.alunos();
                break;
            case 4:
                mostraAllAlunos();
                break;
            case 5:
                mostrarAllDisciplinas();
                break;
            case 6:
                System.exit(0);
            default:
                System.exit(0);
        }
    }

    private static void mostraAllAlunos() {
        // Se houver Alunos ele mostra, se não, avisa que não tem
        if(Aluno.alunos.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há alunos cadastrados", "Alunos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, Aluno.alunos.toArray(), "Alunos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
        }
        menu();
    }

    private static void inserirCursos(){

        // o Usuario digita quanto cursos deseja cadastrar e o programa os armazena em uma fila
        String qntd = JOptionPane.showInputDialog(null, "Quantos cursos deseja adicionar?", "Quantidade");
        if(qntd == null) {
        	menu();
        }else {
        	for(int i = 0; i < Integer.parseInt(qntd); i++){
        		cursos.add(JOptionPane.showInputDialog(null, "Digite o nome do curso:","Nome do Curso", JOptionPane.QUESTION_MESSAGE));
            
        	}
        }
        
        menu();
    }


    private static void mostrarCursos(){
        // Se houver cursos ele mostra, se não, avisa que não tem
        if(cursos.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há cursos cadastrados", "Cursos", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, cursos.toArray(), "Cursos", JOptionPane.INFORMATION_MESSAGE);
        }
        menu();
    }


    private static void mostrarAllDisciplinas(){
        // Se houver Disciplinas ele mostra, se não, avisa que não tem
        if(Cursos.allDisciplinas.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há disciplinas cadastradas", "Disciplinas", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, Cursos.allDisciplinas.toArray(), "Disciplinas", JOptionPane.INFORMATION_MESSAGE);
        }
        menu();
    }
}