package poo.lista01;

import java.util.Scanner;


public class PessoaTeste {
    public static void main(String[] args){
        int opcao = 0;
        Pessoa p = new Pessoa();
        Scanner bat = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("----Menu----");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Mostrar Pessoa");
            System.out.println("3 - Sair");
            System.out.println("Escolha a opcão desejada:");
            opcao = Integer.parseInt(bat.next());
            switch (opcao){
                case 1:
                    System.out.println("Digite o CPF");
                    p.setCpf(bat.nextLine());
                     System.out.println("Digite o nome");
                    p.setNome(bat.nextLine());
                    System.out.println("Digite a sua Idade ");
                    p.setIdade(bat.nextInt());
                    System.out.println("Digite o sexo ");
                    p.setSexo(bat.next().charAt(0));
                    break;
                case 2:
                     System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O Sistema será fechado!");
                    break;
                    default:
                    System.out.println("Opção Inválida!");
                    
            }
        }
       bat.close(); 
    }
}
