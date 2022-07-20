package exer5;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco contabanco = new ContaBanco();
        Scanner var = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = var.nextLine();
        nome = contabanco.consultarNome(contabanco.getNome());
        System.out.print("Digite o n° da sua conta: ");
        int numConta = var.nextInt();
        
        int opcao = 0;

        while (opcao != 4) {
        System.out.println("\n\n ----- Sistema Bancário -----");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Sair");
        System.out.print("\nDigite uma opção: ");
        
        opcao = var.nextInt();

        switch (opcao) {
            case 1:      
            System.out.print("Digite o valor de saque: ");
            float valorSaque = var.nextFloat();
            contabanco.sacar(valorSaque);
            valorSaque = contabanco.getSaldo(); 
            System.out.println("Seu saldo é de R$"+valorSaque);
            break;
            case 2:
                System.out.print("Digite o valor de deposito: ");
                float valorDep = var.nextFloat();
                contabanco.depositar(valorDep);
                System.out.println("Deposito de R$"+valorDep+" Realizado com sucesso!");
                valorDep = contabanco.getSaldo();
                System.out.println("Seu saldo é de R$"+valorDep);
                break;
            case 3: 
                float saldo = contabanco.consultarSaldo(contabanco.getSaldo());
                System.out.println("Seu saldo é de R$: "+saldo);
                break;
            case 4:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção Inválida");
                break;
            }
        }        
    }
    
}
