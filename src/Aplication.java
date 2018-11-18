import java.util.Scanner;

public class Aplication {
    public static void main(String[] args){
    	Calculadora calculator = new Calculadora();
/*        Scanner sc = new Scanner(System.in);
        int a, b, c, r;

        do {
            System.out.println("1 - Fatorial\n" +
                    "2 - Potencia\n" +
                    "3 - Soma\n" +
                    "4 - Produto\n" +
                    "5 - MDC\n" +
                    "6 - PG");
            r = sc.nextInt();

            switch (r) {
                case 1:
                    System.out.println("-------FATORIAL---------\nDigite os valores:");
                    a = sc.nextInt();
                    System.out.println(fatorial(a));
                    break;
                case 2:
                    System.out.println("-------POTENCIA---------\nDigite os valores:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(potencia(a, b));
                    break;
                case 3:
                    System.out.println("-------SOMA---------\nDigite os valores:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(soma(a, b));
                    break;
                case 4:
                    System.out.println("-------PRODUTO---------\nDigite os valores:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(produto(a, b));
                    break;
                case 5:
                    System.out.println("-------MDC---------\nDigite os valores:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(mdc(a, b));
                    break;
                case 6:
                    System.out.println("-------PG---------\nDigite os valores:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = sc.nextInt();
                    System.out.println(pg(a, b, c));
                    break;
            }
            System.out.println("\n");
        }while (r >= 1 && r <= 6);*/
    }

    public static int fatorial(int a){
        if(a == 0)
            return 1;
        else
            return a * fatorial(--a);
    }
    public static int potencia(int a, int b){
        if(b == 0)
            return 1;
        else
            return a * potencia(a, --b);
    }
    public static int soma(int a, int b){
        if(b == 0)
            return a;
        else
            return 1 + soma(a, --b);
    }
    public static int produto(int a, int b){
        if(b == 0)
            return 0;
        else
            return a + produto(a, --b);
    }
    public static int mdc(int a, int b){
        if(a%b == 0)
            return b;
        else
            return mdc(b,(a%b));
    }
    public static int pg(int a, int b, int c){
        if(c == 1)
            return a;
        else
            return b * pg(a, b, --c);
    }
}
