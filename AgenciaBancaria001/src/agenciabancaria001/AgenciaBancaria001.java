package agenciabancaria001;

import java.util.Scanner;

public class AgenciaBancaria001 {
    public static void main(String[] args) {
        AgenciaBancaria agencia = new AgenciaBancaria();
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, Bem Vindo a sua Agencia Bancaria :)");

        int opcao = 0;
        do { 
            System.out.println("\n\nAGENCIA BANCARIA DE ");
            System.out.println("\n1 - Abrir Conta");
            System.out.println("2 - Fechar Conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Ver Dados");
            System.out.println("0 - Sair");
            System.out.print("\nDigite sua opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    Conta novo = null;
                    System.out.println("Qual tipo de conta deseja abrir");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    int op = sc.nextInt();
                    if (op == 1) {
                        novo = new ContaCorrente();
                        System.out.print("Digite o nome da conta: ");
                        novo.setDono(sc.next());
                        System.out.print("Digite o numero da conta: ");
                        novo.setNumConta(sc.nextInt());
                        System.out.print("Digite o limite da conta: ");
                        ((ContaCorrente)novo).setLimite(sc.nextInt());
                    } else if (op == 2) {
                        novo = new ContaPoupanca();
                        System.out.print("Digite o nome da conta: ");
                        novo.setDono(sc.next());
                        System.out.print("Digite o numero da conta: ");
                        novo.setNumConta(sc.nextInt()); 
                    }
                    agencia.abrirConta(novo);
                    System.out.println("Conta aberta com sucesso!");
                break;
                case 2:
                    System.out.print("Digite o número da conta: ");
                    agencia.fecharConta(sc.nextInt());
                    System.out.println("Conta fechada com sucesso!");
                break;
                case 3:
                    System.out.print("Digite o número da conta: ");
                    Conta depositar = agencia.buscarConta(sc.nextInt());
                    System.out.print("Digite o valor que deseja depositar: ");
                    depositar.depositar(sc.nextDouble());
                    System.out.println("Deposito feito com sucesso!");
                break;
                case 4:
                    System.out.print("Digite o número da conta: ");
                    Conta sacar = agencia.buscarConta(sc.nextInt());
                    System.out.print("Digite o valor que deseja sacar: ");
                    sacar.sacar(sc.nextDouble());
                break;
                case 5:
                    System.out.println("Digite o número da conta: ");
                    Conta dados = agencia.buscarConta(sc.nextInt());
                    System.out.println(dados.DadosDono());
                break;
                case 0:
                    System.out.println("\nObrigado Pelo Acesso!");  
                break;
                default: 
                    System.out.println("Opção Incorreta! \nTente novamente");
                    break;
            }
            
        } while (opcao != 0);
    }
}
