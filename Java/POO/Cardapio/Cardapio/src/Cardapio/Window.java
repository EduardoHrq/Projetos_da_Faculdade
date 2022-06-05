package Cardapio;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window extends JFrame {
	
	Cardapio cardapio = new Cardapio(); // Instancia de Cardapio para que seja possivel mostra os produtos na janela
	JLabel areatxt = new JLabel(); // JLabel que sofre alterações de texto conforme as escolhas

	// Criando a janela atravez do JFrame
	public Window() {
		setTitle("Cardapio"); // titulo da janela
		setSize(500, 500); // tamanho da janela
		setResizable(false); // se a janela pode ser redimensionada manualmente 
		setLocationRelativeTo(null); // local onde ela é criada
		setLayout(null); // sem layout pre definido
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // o ocorre ao fechar a janela
		
		addP(); // chamando o metodo que criara os JPanels 

		setVisible(true); // Torna a janela visivel
		repaint();
	}
	

	// Metodo que adiciona JPanels ao JFrame e irá compor a janela
	public void addP() {
		JPanel c1 = (JPanel) this.getContentPane();
		c1.setLayout(new BoxLayout(c1, BoxLayout.Y_AXIS)); // O alinhanento do conteudos será baseados em um eixo X
		
		JPanel area2 = new JPanel();
		area2.setLayout(new FlowLayout()); // os botões serão alinhados ao meio da janela e com espaçamento entre eles
		area2.setBackground(Color.LIGHT_GRAY);
		area2.add(btAdd()); // uma forma de adicionar o botão ao JPanel
		btMostrar(area2); // Adicionando um botão atravez de um metodo
		c1.add(area2);
		
		JPanel area3 = new JPanel();
		area3.setLayout(new FlowLayout()); // o texto que sofrerá modificações se encontrará centralizado na tela
		area3.setBackground(Color.LIGHT_GRAY);		
		areatxt.setFont(new Font("Arial Black", Font.BOLD, 12)); // Fonte definida para o texto
		area3.add(areatxt);
		c1.add(area3);
		
		repaint();
	}
	
	// Metodo que cria o botão para adicionar novos produtos
	public Component btAdd() {
		
		JButton add = new JButton("ADICIONAR"); // texto que vai dentro do botão
		add.setFont(new Font("Arial Black", Font.BOLD, 10));
		add.setForeground(Color.WHITE);
		add.setBackground(Color.BLUE);
		add.setBorderPainted(false); // botão sem borda
		add.doClick(); // clicavel
		add.setFocusPainted(false); // não inicia com foco
		
		// um 
		add.addActionListener(new ActionListener() {
				public void actionPerformed( ActionEvent event ) {
					try {
						cardapio.adicionarProduto();
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algum erro ocorreu", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
				}
            }
		);

		
		return add;
	}
	
	// Metodo para mostrar o itens do cardapio
	public void btMostrar(JPanel q) {
		
		JButton btComidas = new JButton("COMIDAS"); // texto dentro do botão
		btComidas.setFont(new Font("Arial Black", Font.BOLD, 10));
		btComidas.setForeground(Color.WHITE);
		btComidas.setBackground(Color.DARK_GRAY);
		btComidas.setBorderPainted(false);
		btComidas.doClick();
		btComidas.setFocusPainted(false);
		
		q.add(btComidas); // onde o botão sera adicionado
		
		btComidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				areatxt.setText(cardapio.opcCardStr(0));
			}
		});
		
		JButton btBebidas = new JButton("BEBIDAS");
		btBebidas.setFont(new Font("Arial Black", Font.BOLD, 10));
		btBebidas.setForeground(Color.WHITE);
		btBebidas.setBackground(Color.DARK_GRAY);
		btBebidas.setBorderPainted(false);
		btBebidas.doClick();
		btBebidas.setFocusPainted(false);
		
		q.add(btBebidas);
		
		btBebidas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				areatxt.setText(cardapio.opcCardStr(1));
			}
		});
		
		
		JButton btCardF = new JButton("CARDAPIO COMPLETO");
		btCardF.setFont(new Font("Arial Black", Font.BOLD, 10));
		btCardF.setForeground(Color.WHITE);
		btCardF.setBackground(Color.DARK_GRAY);
		btCardF.setBorderPainted(false);
		btCardF.doClick();
		btCardF.setFocusPainted(false);
		
		q.add(btCardF);
		
		btCardF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				areatxt.setText(cardapio.opcCardStr(2));
			}
		});
		
		
	}
}
