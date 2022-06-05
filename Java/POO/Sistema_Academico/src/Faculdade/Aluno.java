/*
Eduardo henrique Lima Silva - 0015751
Henrique Bitencourt Oliveira
*/

package Faculdade;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JOptionPane;

public class Aluno {

    // atributos e variaveis globais
    static Object[] menu = {"Cadastrar um novo aluno", "matricular em curso", "Voltar"};
    static Queue<Object> alunos = new LinkedList<Object>();
    static ArrayList<Object> alunosName = new ArrayList<Object>();
    static ArrayList<Object> alunosMatriculados = new ArrayList<Object>();
    static int cont;

    //funcionamento pareciodo com o de um construtor
    public static void alunos() {
    	Cursos.setCursos();
    	
        for(int i = 0; i < 2; i++){
            alunosMatriculados.add("0");
        }

        //menu de opções com botões
        int res = JOptionPane.showOptionDialog(null,"Escolha uma opção", "Alunos", 0, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
        switch(res){
            case 0:
                cadastrarAlunos();
                break;
            case 1:
                matricularEmCursos();
                break;
            case 2:
                Universidade.menu();
        }
    }
    private static void matricularEmCursos() {

        Queue<Object> cadAluno = new LinkedList<Object>();

        // se não houver cursos, não há como matricular alunos
        if(Universidade.cursos.size() == 0){
            JOptionPane.showMessageDialog(null, "Ainda não há cursos cadastrados", "Matriculas", JOptionPane.INFORMATION_MESSAGE);
            alunos();
        }else{
            // quanto alunos serão matriculados no curso
            String qntd = JOptionPane.showInputDialog(null, "Quantos alunos deseja matricular em um curso?", "Quantidade");
            if(qntd == null) {
                alunos();
            }else {
                for(int i = 0; i < Integer.parseInt(qntd); i++){
                    Object[] listAlunos = alunosName.toArray();
                    Object nm = JOptionPane.showInputDialog(null, "escolha os alunos abaixo:", "Matriculas", JOptionPane.QUESTION_MESSAGE, null, listAlunos, listAlunos[0]);
                    cadAluno.add(nm);
                    // conforme os alunos vão sendo selecionados, vão sendo retirados da lista
                    alunosName.remove(nm);
                }

                // adicionado valores no array list para evitar erros
                for(int i = 0; i < 2; i++){
                    alunosMatriculados.add("0");
                }

                // menu para escolher em qual curso os alunos serao matriculados
                Object res = JOptionPane.showInputDialog(null, "Escolha o curso que deseja matricular o/a(s) aluno/a(s):", "Cursos", JOptionPane.QUESTION_MESSAGE, null, Cursos.menu, Cursos.menu[0]);

                if(res == "Voltar" || res == null){
                    matricularEmCursos();
                    
                } else{
                    for( int i = 0; i < Universidade.cursos.size(); i++){
                        if(res == Cursos.menu[i]){
                            cont = i;
                        }
                    }
                }

                // gerando um array dentro de outro array, os alunos de um cursos são armazenados
                alunosMatriculados.add(cont, cadAluno.toArray());

            }
        }

        alunos();

    }
    private static void cadastrarAlunos() {
        Queue<Object> aux = new  LinkedList<Object>();

        // quantos alunos seram cadastrados
        String qntd = JOptionPane.showInputDialog(null, "Quantos alunos deseja cadastrar?", "Quantidade");
        if(qntd == null) {
        	alunos();
        }else {
        	for(int i = 0; i < Integer.parseInt(qntd); i++){
        		aux.add(JOptionPane.showInputDialog(null, "Digite o nome do aluno:","Nome do aluno", JOptionPane.QUESTION_MESSAGE));
        	}

            // passando os dados da variavel local para as duas globais
            while(!aux.isEmpty()){
                alunos.add(aux.peek());
                alunosName.add(aux.poll());
            }
        }
        alunos();
    }
    
}
