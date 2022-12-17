package Projeto.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int dividir = dividir(a, b);
        double expoente = expoente(a, b);

        System.out.println("Soma= " + somar);
        System.out.println("Subtr= " + subtrair);
        System.out.println("Div= " + dividir);
        System.out.println("Expoente= " + expoente);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static double expoente(int a, int b) {
        float c = Float.parseFloat(String.valueOf(a));
        return Math.pow(c, b);
    }


}
