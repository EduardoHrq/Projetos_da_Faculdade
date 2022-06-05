/*
Eduardo henrique Lima Silva - 0015751
Henrique Bitencourt Oliveira
*/

package Faculdade;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Cursos extends Universidade{
    
    // atributos e variaveis, sendo algumas em filas e outras em Lista de Arrays e array
    static Object[] menu = {"Voltar"};
    static Object[] ordem = {};
    static ArrayList<Object> disC = new ArrayList<Object>();
    static ArrayList<Object> auxDisC = new ArrayList<Object>();
    static Queue<Object> allDisciplinas = new LinkedList<Object>();

    private static int cont = 0;

    // Funcionando como se fosse o meu construtor
    public static void cursos(){
        setCursos();

        // Menu de escolhas, escolher o curso
        Object res = JOptionPane.showInputDialog(null, "Escolha o curso:", "Cursos", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);

        // tem a opção voltar, mas caso o usuario cancele ele retorna para o principal
        if(res == "Voltar" || res == null){
            cursos.remove("Voltar");
            Universidade.menu();
            
        } else{
            for( int i = 0; i < cursos.size(); i++){
                if(res == menu[i]){
                    cont = i;
                    getCurso();
                }
            }
        }
    }

    // metodo que gera os itens do menu
    public static void setCursos(){
    
        if(cursos.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há nenhum curso!","Aviso", JOptionPane.ERROR_MESSAGE);
            
            cursos.add("Voltar");
        }else{
            for(int i = 0; i < menu.length; i++){
                if(menu[i] == "Voltar"){
                    cursos.remove("Voltar");
                }
            }
            cursos.add("Voltar");
            menu = cursos.toArray();
            
        }
        
    }

    // metodo que o usuario poderá ver informações sobre o curso escolhido bem como adicionar
    private static void getCurso(){
        // menu de escolhas com botões, logo apos direcionados por um switch
        Object[] escolhas = {"Adicionar disciplina", "Mostrar Disciplinas", "Alunos", "Voltar"};
        int res = JOptionPane.showOptionDialog(null, menu[cont], menu[cont].toString(), 0, JOptionPane.INFORMATION_MESSAGE, null, escolhas, escolhas[0]);
        switch(res){
            case 0: 
                adicionarDisciplina(cont);
                break;
            case 1: 
                mostrarDisciplinas(cont);
                break;
            case 2:
                alunosMatriculados(cont);
                break;
            case 3:
                cursos();
                break;
            default:
                cursos();
        }
                
    }

    // Mostra os alunos que estão matriculados no curso se houver
    private static void alunosMatriculados(int v) {
        if(Aluno.alunosMatriculados.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há Alunos Matriculados", "Matriculas", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, Aluno.alunosMatriculados.get(v), "Alunos do curso", JOptionPane.INFORMATION_MESSAGE);
        }

        getCurso();
    }

    // Mostra as disciplinas do curso se houver
    private static void mostrarDisciplinas(int q) {
        if(disC.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há disciplinas curso", "disciplinas", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, disC.get(q), "Disciplinas do curso", JOptionPane.INFORMATION_MESSAGE);

        }
        
        getCurso();
    }

    static int cont2 = cont;
    public static void adicionarDisciplina(int c){

        // adiciona valores ao array list para que não haja erros
        for(int f = 0; f < 3; f++){
        	auxDisC.clear();
            disC.add("0");
        }

        // variavel ou fila local para manuzei dos dados
        Queue<String> disciplinas = new LinkedList<String>();

        // o usuario escolhe quantas materia quer adicionar 
        String qntd = JOptionPane.showInputDialog(null, "Quantas disciplinas deseja adiconar?", JOptionPane.QUESTION_MESSAGE);
        for(int i = 0; i < Integer.parseInt(qntd); i++){
            disciplinas.add(JOptionPane.showInputDialog(null, "Digite o nome da disciplina:", JOptionPane.QUESTION_MESSAGE));
        }
        
        // é passado os valores para outras duas filas
        while(!disciplinas.isEmpty()){
            allDisciplinas.add(disciplinas.peek());
            auxDisC.add(disciplinas.poll());
        }

        // o array list substitui o valor já na posição "c", pelos valores digitados pelo usuario, 
        //gerando um array dentro de outro array
        disC.add(c, auxDisC.toArray());


        getCurso();
    }
}