package poo.lista01;

import java.util.Scanner;

public class FuncionarioTeste {

    public static void main(String[] args) {
        int opcao = 0;
        Funcionario f = new Funcionario();
        Scanner bat = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println("-----Menu-----");
            System.out.println("1 - Criar Funcionario");
            System.out.println("2 - Mostrar Folha de Pagamento");
            System.out.println("3 - Alterar Remuneracao");
            System.out.println("4 - Sair");
            System.out.println("Escolha a opcão desejada:");
            opcao = Integer.parseInt(bat.next());

            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero do cracha ");
                    f.setCracha(bat.nextInt());
                    System.out.println("Digite o nome");
                    f.setNome(bat.next());
                    ;
                    System.out.println("Digite o tipo de vinculo");
                    f.setTipoVinculo(bat.next().charAt(0));
                    if (f.getTipoVinculo() == 'H') {
                        System.out.println("Valor Hora ");
                        f.setValorHora(bat.nextFloat());
                        System.out.println("Quantidade de horas ");
                        f.setQtdeHora(bat.nextFloat());
                    } else {
                        System.out.println("Salario ");
                        f.setSalario(bat.nextFloat());
                    }
                    System.out.println("Digite o Desconto ");
                    f.setValorDesconto(bat.nextFloat());
                    break;
                case 2:
                    System.out.println(f.imprimir());
                    break;
                case 3:
                    if (f.getTipoVinculo() == 'H') {
                        System.out.println("Valor Hora ");
                        f.setValorHora(bat.nextFloat());
                        System.out.println("Quantidade de horas");
                        f.setQtdeHora(bat.nextFloat());
                        System.out.println("Novo salario " + f.getValorHora() * f.getQtdeHora());
                    } else {
                        System.out.println("Salario ");
                        f.setSalario(bat.nextFloat());
                        System.out.println("Novo salario " + f.getSalario());
                    }
                    break;
                case 4:
                    System.out.println("O Sistema Sera Fechado! ");
                    break;
                default:
                    System.out.println("Opção Inválida!");

            }
        }
        bat.close();
    }
}
