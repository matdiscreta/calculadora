import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Calculadora {
    private static JTextField result = new JTextField();

    public static void main(String[] ars){
        calcular();
    }

    private static void calcular(){

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
        numeros.setLayout(new GridLayout(4,3));

        JPanel metodos = new JPanel();
        metodos.setBorder(new LineBorder(new Color(255, 111, 14), 2, true));
        botoes.add(metodos);
        metodos.setLayout(new GridLayout(3,2));

        JButton b7 = new JButton("7");
        b7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b7.setBackground(Color.LIGHT_GRAY);
        numeros.add (b7);

        JButton b8 = new JButton("8");
        b8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b8.setBackground(Color.LIGHT_GRAY);
        numeros.add(b8);

        JButton b9 = new JButton("9");
        b9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b9.setBackground(Color.LIGHT_GRAY);
        numeros.add(b9);

        JButton fatorial = new JButton("FATORIAL");
        fatorial.setFont(new Font("Tahoma", Font.PLAIN, 20));
        fatorial.setBackground(new Color(255, 111, 14));
        fatorial.setForeground(Color.LIGHT_GRAY);
        metodos.add(fatorial);

        JButton potencia = new JButton("POTENCIA");
        potencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
        potencia.setBackground(new Color(255, 111, 14));
        potencia.setForeground(Color.LIGHT_GRAY);
        metodos.add(potencia);

        JButton b4 = new JButton("4");
        b4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b4.setBackground(Color.LIGHT_GRAY);
        numeros.add(b4);

        JButton b5 = new JButton("5");
        b5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b5.setBackground(Color.LIGHT_GRAY);
        numeros.add(b5);

        JButton b6 = new JButton("6");
        b6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b6.setBackground(Color.LIGHT_GRAY);
        numeros.add(b6);

        JButton soma = new JButton("SOMA");
        soma.setFont(new Font("Tahoma", Font.PLAIN, 20));
        soma.setBackground(new Color(255, 111, 14));
        soma.setForeground(Color.LIGHT_GRAY);
        metodos.add(soma);

        JButton produto = new JButton("PRODUTO");
        produto.setFont(new Font("Tahoma", Font.PLAIN, 20));
        produto.setBackground(new Color(255, 111, 14));
        produto.setForeground(Color.LIGHT_GRAY);
        metodos.add(produto);

        JButton b1 = new JButton("1");
        b1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b1.setBackground(Color.LIGHT_GRAY);
        numeros.add(b1);

        JButton b2 = new JButton("2");
        b2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b2.setBackground(Color.LIGHT_GRAY);
        numeros.add(b2);

        JButton b3 = new JButton("3");
        b3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b3.setBackground(Color.LIGHT_GRAY);
        numeros.add(b3);

        JButton mdc = new JButton("MDC");
        mdc.setFont(new Font("Tahoma", Font.PLAIN, 20));
        mdc.setBackground(new Color(255, 111, 14));
        mdc.setForeground(Color.LIGHT_GRAY);
        metodos.add(mdc);

        JButton pg = new JButton("PG");
        pg.setFont(new Font("Tahoma", Font.PLAIN, 20));
        pg.setBackground(new Color(255, 111, 14));
        pg.setForeground(Color.LIGHT_GRAY);
        metodos.add(pg);


        JButton limpar = new JButton("C");
        limpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
        limpar.setBackground(Color.LIGHT_GRAY);
        numeros.add(limpar);

        JButton b0 = new JButton("0");
        b0.setFont(new Font("Tahoma", Font.PLAIN, 20));
        b0.setBackground(Color.LIGHT_GRAY);
        numeros.add(b0);

        JButton igual = new JButton("=");
        igual.setFont(new Font("Tahoma", Font.PLAIN, 20));
        igual.setForeground(Color.BLACK);
        igual.setBackground(Color.LIGHT_GRAY);
        numeros.add(igual);

        janela.setVisible(true);
    }


}
