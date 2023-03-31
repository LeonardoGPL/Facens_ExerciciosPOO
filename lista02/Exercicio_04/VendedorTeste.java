
package poo.lista02;

import java.util.Scanner;


public class VendedorTeste {
    public static void main(String[] args) {
        int opcao = 0;
        Vendedor v = new Vendedor();
        
        Scanner bat = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("----Menu----");
            System.out.println("1 - Cadastrar Vendedor");
            System.out.println("2 - Calcular Comissao");
            System.out.println("3 - Sair");
            System.out.println("Escolha a opcão desejada:");
            opcao = Integer.parseInt(bat.next());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o codigo ");
                    v.setCodigo(bat.nextInt());
                    System.out.println("Digite o nome ");
                    v.setNome(bat.next());
                    System.out.println("Digite a Porcentagem de Comissao ");
                    v.setPercentualComissao(bat.nextDouble());
                    
                    break;
                case 2:
                    System.out.println("Digite o valor da venda ");
                   double valorVenda = bat.nextDouble();
                   System.out.println("Digite o valor do desconto");
                   double desconto = bat.nextDouble();
                   System.out.println(v.imprimir(valorVenda, desconto));
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
