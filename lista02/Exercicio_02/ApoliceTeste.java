package poo.lista02;

import java.util.Scanner;

public class ApoliceTeste {

    public static void main(String[] args) {
        int opcao = 0;
        Apolice p = new Apolice();
        Scanner bat = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("----Menu----");
            System.out.println("1 - Criar Apolice");
            System.out.println("2 - Ver dados da Apolice");
            System.out.println("3 - Sair");
            System.out.println("Escolha a opcão desejada:");
            opcao = Integer.parseInt(bat.next());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero da Apolice");
                    p.setNumero(bat.nextInt());
                    System.out.println("Digite o nome ");
                    p.setNome(bat.next());
                    System.out.println("Digite sua Idade ");
                    p.setIdade(bat.nextInt());
                    System.out.println("Digite o sexo ");
                    p.setSexo(bat.next().charAt(0));
                    System.out.println("Digite o Valor do Automovel ");
                    p.setValorautomovel(bat.nextDouble());
                    break;
                case 2:
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O Sistema Sera Fechado! ");
                    break;
                default:
                    System.out.println("Opção Inválida");

            }

        }

    }

}
