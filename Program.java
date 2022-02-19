import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = calc.somar(a, b);
        int subtracao = calc.subtrair(a, b);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);

        sc.close();
    }
}
