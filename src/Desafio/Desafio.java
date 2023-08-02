package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
        String nome="Homem aranha";
        String tipoConta="Corrente";
        double saldo=1599.99;
        int opcao=0;

        System.out.println("********************");
        System.out.println("Nome do cliente:"+nome);
        System.out.println("Tipo conta:"+tipoConta);
        System.out.println("Saldo Conta: R$"+saldo);

        String menu= """
                Digite sua opção
                1- Consultar Saldo
                2- Transferir valor
                3- Receber valor
                4-Sair
                
                """;

                Scanner leitura= new Scanner(System.in);

        while(opcao != 4){
            System.out.println(menu);
            opcao=leitura.nextInt();
            if (opcao==1){
                System.out.println("O Saldo atualizado é: R$"+saldo);
            }else if(opcao==2){
                System.out.println("Qual valor a ser transferido?");
                double valor=leitura.nextDouble();

                if (valor > saldo){
                    System.out.println("Saldo insuficiente");
                }else {
                    saldo -=valor;
                    System.out.println("O novo saldo é R$:"+saldo);

                }

            }else if (opcao == 3){
                System.out.println("Valor recebido:");
                double recebido=leitura.nextDouble();
                saldo += recebido;
                System.out.println("Novo saldo: R$"+saldo);

            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }

    }
}
