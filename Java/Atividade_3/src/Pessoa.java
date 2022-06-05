
// Pesquisei e achei este, que consegue pegar a data do computador
import java.time.LocalDate;
import java.util.*;

//Criando a classe pessoa
public class Pessoa {
	
	// Instanciando o Scanner
	Scanner info = new Scanner(System.in);

	/*
	 * Atributos: nome, data de nasciemnto e altura. Eu quis aumentar 
	 * e coloquei mais atributos, somente por curiosidade e apredizagem
	*/
	private String nome;
	private String sexo;
	
	//Array que irá armazenar respectiamente, o dia, o mes e o ano 
	private int[] dataNascimento = new int[3];
	private double altura;
	
	/*
	 * Construtor, que ao instanciar um nova pessoa irá, dar execultar 
	 * comando de entrada de dados, para nome, data de nascimento e
	 * altura
	 */
	public Pessoa() {
		
		System.out.print("\nDigite seu nome: ");
		this.setNome(info.nextLine());
		
		System.out.print("\nSexo\n1 -> Masculino\n2 -> Feminino\nDigite sua opção aqui:");
		this.setSexo(info.nextInt());

		System.out.print("\nDigite sua data de nascimento:\nDIA: ");
		this.setDataNascimentoDia(info.nextInt());
		System.out.print("MES: ");
		this.setDataNascimentoMes(info.nextInt());
		System.out.print("ANO: ");
		this.setDataNascimentoAno(info.nextInt());
		
		
		System.out.print("\nDigite sua altura: ");
		this.setAltura(info.nextDouble());
		
	}
	
	//Getters e Setters do atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataNascimento(int i) {
		return dataNascimento[i];
	}
	
	public void setDataNascimentoDia(int dataNascimento) {

		this.dataNascimento[0] = dataNascimento;
		
	}
	public void setDataNascimentoMes(int dataNascimento) {

		this.dataNascimento[1] = dataNascimento;
		
	}
	public void setDataNascimentoAno(int dataNascimento) {

		this.dataNascimento[2] = dataNascimento;
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		switch(sexo) {
			case 1:
				this.sexo = "Masculino";
				break;
			case 2:
				this.sexo = "Feminino";
				break;
			default:
				this.sexo = "Não foi informado";
		}
	}

	//Metodo que irá retornar a idade
	public int getIdade() {
		//buscando o ano que se encontra na data do computador
		int ano = LocalDate.now().getYear();
		
		//Buscando o mes que se encontra na data do computador
		int mes = LocalDate.now().getMonthValue();
		
		//Buscando o mes que se encontra na data do computador
		int dia = LocalDate.now().getDayOfMonth();
		
		//Calculo da idade, com o ano do computador e o ano digitado pelo usuário
		int idade = ano - this.getDataNascimento(2);
		
		/*
		 * Pequeno condicional que irá verficar se o aniversario já 
		 * passou ou não, a fim de dizer a idade exata
		 */
		if(this.getDataNascimento(1) > mes) {
			if(this.getDataNascimento(0) > dia) {
				return idade - 1;
			}else {
				return idade - 1;
			}
		}else {
			return idade;
		}
	}
	
	/*
	 * Metodo toString que irá printar o que esta retornando
	 * quando chamar o objeto dentro de um println, será o estado atual
	 */
	public String toString(){	
		String idade = this.getIdade() + " Anos";
		String altura = this.getAltura() + " M";
		
		return "\n=================================" + "\n              DADOS" + 
				"\n=================================" + "\nNome: " + this.getNome()
				+ "\nSexo: " + this.getSexo() + "\nData de Nascimento: " + 
				this.getDataNascimento(0) + " / " + this.getDataNascimento(1) +
				" / " + this.getDataNascimento(2) + "\nAltura: " + altura + 
				"\nIdade: " + idade;
	}
	public static void main(String[] args) {
		/*
		//instanciando o classe Pessoa, como objeto p1
		Pessoa p1 = new Pessoa();
		
		//printando p1, que será o que esta no toString
		System.out.print(p1);*/
		
		int num[][] = new int[10][10];
		
		int y = 3;
		int x = 1;
		
		num[x+y][y-x] = 5;
		
		System.out.print(num[4][2]);
		
		
	}
	
}
