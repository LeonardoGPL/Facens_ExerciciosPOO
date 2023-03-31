package poo.lista02;

import java.util.Scanner;

public class CalculadoraTeste {

    public static void main(String[] args) {
        int opcao = 0;
        Calculadora c = new Calculadora();

        Scanner bat = new Scanner(System.in);
        while (opcao != 5) {
            System.out.println("Digite um numero: ");
            double num1 = bat.nextDouble();
            System.out.println("Digite um outro numero: ");
            double num2 = bat.nextDouble();
            System.out.println("-----Calculadora-----\nEscolha uma opcao: \n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Sair");
            opcao = bat.nextInt();

            switch (opcao) {
                case 1:
                    c.soma(num1, num2);
                    System.out.println(c.soma(num1, num2));
                    break;

                case 2:
                    c.subtracao(num1, num2);
                    System.out.println(c.subtracao(num1, num2));
                    break;
                case 3:
                    c.multiplicacao(num1, num2);
                    System.out.println(c.multiplicacao(num1, num2));
                    break;
                case 4:
                    c.divisao(num1, num2);
                    System.out.println(c.divisao(num1, num2));
                    break;
                case 5:
                    System.out.println("Calculadora encerrada");
                    break;

                default:
                    System.out.println("Opcao Invalida");

            }

        } 
        bat.close();
    }
}
