package poo.lista01;

import java.util.Scanner;

public class AlunoTeste {

    public static void main(String[] args) {
        int opcao = 0;
        Aluno a = new Aluno();
        Scanner bat = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("----Menu----");
            System.out.println("1 - Criar Aluno");
            System.out.println("2 - Mostrar Aluno");
            System.out.println("3 - Sair");
            System.out.println("Escolha a opcão desejada:");
            opcao = Integer.parseInt(bat.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o Nome");
                    a.setNome(bat.nextLine());
                    System.out.println("Digite o RA");
                    a.setRa(bat.nextLine());
                    System.out.println("Digite a nota AC1: ");
                    a.setAc1(bat.nextFloat());
                    System.out.println("Digite a nota AC2: ");
                    a.setAc2(bat.nextFloat());
                    System.out.println("Digite a nota AG: ");
                    a.setAg(bat.nextFloat());
                    System.out.println("Digite a nota AF: ");
                    a.setAf(bat.nextFloat());
                    System.out.println("Aluno criado com sucesso!");
                    bat.nextLine();

                    break;
                case 2:
                    System.out.println(a.imprimir());
                    break;
                case 3:
                    System.out.println("O Sistema será fechado!");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }

        bat.close();
    }
}
