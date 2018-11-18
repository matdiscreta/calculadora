import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Calculadora implements ActionListener{
	private  JTextField result = new JTextField();
	private  int a,b,c,contador = 0,resultado;
	private StatusButton status = StatusButton.INICIO;
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");	
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton fatorial = new JButton("FATORIAL");
	JButton potencia = new JButton("POTENCIA");
	JButton soma = new JButton("SOMA");
	JButton produto = new JButton("PRODUTO");
	JButton mdc = new JButton("MDC");
	JButton pg = new JButton("PG");
	JButton limpar = new JButton("C");
	JButton igual = new JButton("=");
	public Calculadora() {
		super();
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		fatorial.addActionListener(this);
		potencia.addActionListener(this);
		soma.addActionListener(this);
		produto.addActionListener(this);
		mdc.addActionListener(this);
		pg.addActionListener(this);
		limpar.addActionListener(this);
		igual.addActionListener(this);
		JFrame janela = new JFrame("Calculadora");
		janela.setBounds(100, 100, 532, 300);
		janela.setBackground(Color.LIGHT_GRAY);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel resultado = new JPanel();
		resultado.setBackground(Color.BLACK);
		janela.add(resultado, BorderLayout.NORTH);

		result.setHorizontalAlignment(JTextField.RIGHT);
		result.setColumns(15);
		result.setBorder(new LineBorder(Color.BLACK, 2, true));
		result.setBackground(Color.BLACK);
		result.setForeground(Color.LIGHT_GRAY);
		result.setEditable(false);
		result.setFont(new Font("Tahoma", Font.PLAIN, 40));
		resultado.add(result);

		JPanel botoes = new JPanel();
		botoes.setBackground(Color.LIGHT_GRAY);
		janela.add(botoes);
		botoes.setLayout(new GridLayout(1, 2));

		JPanel numeros = new JPanel();
		numeros.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
		botoes.add(numeros);
		numeros.setLayout(new GridLayout(4, 3));

		JPanel metodos = new JPanel();
		metodos.setBorder(new LineBorder(new Color(255, 111, 14), 2, true));
		botoes.add(metodos);
		metodos.setLayout(new GridLayout(3, 2));

		b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b7.setBackground(Color.LIGHT_GRAY);
		numeros.add(b7);

		b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b8.setBackground(Color.LIGHT_GRAY);
		numeros.add(b8);

		b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b9.setBackground(Color.LIGHT_GRAY);
		numeros.add(b9);

		fatorial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fatorial.setBackground(new Color(255, 111, 14));
		fatorial.setForeground(Color.LIGHT_GRAY);
		metodos.add(fatorial);

		potencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		potencia.setBackground(new Color(255, 111, 14));
		potencia.setForeground(Color.LIGHT_GRAY);
		metodos.add(potencia);

		b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b4.setBackground(Color.LIGHT_GRAY);
		numeros.add(b4);

		b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b5.setBackground(Color.LIGHT_GRAY);
		numeros.add(b5);

		b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b6.setBackground(Color.LIGHT_GRAY);
		numeros.add(b6);

		soma.setFont(new Font("Tahoma", Font.PLAIN, 20));
		soma.setBackground(new Color(255, 111, 14));
		soma.setForeground(Color.LIGHT_GRAY);
		metodos.add(soma);

		produto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		produto.setBackground(new Color(255, 111, 14));
		produto.setForeground(Color.LIGHT_GRAY);
		metodos.add(produto);

		b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b1.setBackground(Color.LIGHT_GRAY);
		numeros.add(b1);

		b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b2.setBackground(Color.LIGHT_GRAY);
		numeros.add(b2);

		b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b3.setBackground(Color.LIGHT_GRAY);
		numeros.add(b3);

		mdc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mdc.setBackground(new Color(255, 111, 14));
		mdc.setForeground(Color.LIGHT_GRAY);
		metodos.add(mdc);

		pg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pg.setBackground(new Color(255, 111, 14));
		pg.setForeground(Color.LIGHT_GRAY);
		metodos.add(pg);

		limpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		limpar.setBackground(Color.LIGHT_GRAY);
		numeros.add(limpar);

		b0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		b0.setBackground(Color.LIGHT_GRAY);
		numeros.add(b0);

		igual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		igual.setForeground(Color.BLACK);
		igual.setBackground(Color.LIGHT_GRAY);
		numeros.add(igual);

		janela.setVisible(true);
	}
	public int fatorial(int a) {
		if (a == 0)
			return 1;
		else
			return a * fatorial(--a);
	}

	public int potencia(int a, int b) {
		if (b == 0)
			return 1;
		else
			return a * potencia(a, --b);
	}

	public int soma(int a, int b) {
		if (b == 0)
			return a;
		else
			return 1 + soma(a, --b);
	}

	public int produto(int a, int b) {
		if (b == 0)
			return 0;
		else
			return a + produto(a, --b);
	}

	public int mdc(int a, int b) {
		if (a % b == 0)
			return b;
		else
			return mdc(b, (a % b));
	}

	public int pg(int a, int b, int c) {
		if (c == 1)
			return a;
		else
			return b * pg(a, b, --c);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mdc) {
			status = StatusButton.MDC;
		}else if(e.getSource()==pg) {
			status = StatusButton.PG;
		}else if(e.getSource()==soma) {
			status = StatusButton.SOMA;
		}else if(e.getSource()==produto) {
			status = StatusButton.PRODUTO;
		}else if(e.getSource()==fatorial) {
			status = StatusButton.FATORIAL;
		}else if(e.getSource()==potencia) {
			status = StatusButton.POTENCIA;
		}else if(e.getSource() == igual) {
			contador++;
			if(contador == status.getnValores()) {
				executaMetodoStatus();
				contador = 0;
				status = StatusButton.INICIO;
			}
		}else if(e.getSource()==limpar) {
			a = 0;
			b = 0;
			c = 0;
			contador = 0;
			resultado = 0;
			result.setText("");
		}else {
			actionNumbers(e,contador);
			if(contador == status.getnValores()) {
				executaMetodoStatus();
				contador = 0;
				status = StatusButton.INICIO;
			}
		}
	}
	
	private void executaMetodoStatus() {
		if(status == StatusButton.MDC) {
			resultado = mdc(a, b);
		}else if(status == StatusButton.PG) {
			resultado = pg(a, b, c);
		}else if(status == StatusButton.SOMA) {
			resultado = soma(a, b);
		}else if(status == StatusButton.PRODUTO) {
			resultado = produto(a, b);
		}else if(status == StatusButton.FATORIAL) {
			resultado = fatorial(a);
		}else if(status == StatusButton.POTENCIA) {
			resultado = potencia(a, b);
		}else if(status == StatusButton.INICIO) {
			resultado = a;
		}
		result.setText("resultado: " + resultado);
	}

	public void actionNumbers(ActionEvent e,int contador) {
		JButton aux = (JButton) e.getSource();
		if(contador == 0) {
			a = Integer.parseInt(a+aux.getText());
			if(status == StatusButton.INICIO) {
				result.setText(a+"");
			}else if(status != StatusButton.MDC && status != StatusButton.PG) {
				result.setText(a+status.getDescricao());	
			}else{
				result.setText(status.getDescricao()+": "+a);	

			}
		}else if(contador == 1) {
			b = Integer.parseInt(b+aux.getText());
			if(status != StatusButton.MDC && status != StatusButton.PG) {
				result.setText(a+status.getDescricao()+b);	
			}else {
				result.setText(status.getDescricao()+": "+a+" ," +b);	
			}
		}else if(contador == 2) {
			c = Integer.parseInt(c+aux.getText());
			if(status != StatusButton.MDC && status != StatusButton.PG) {
				result.setText(a+status.getDescricao()+b+status.getDescricao()+c);	
			}else {
				result.setText(status.getDescricao()+": "+a+" ," +b+" ," +c);	
			}
		}
	}
	
	
}
