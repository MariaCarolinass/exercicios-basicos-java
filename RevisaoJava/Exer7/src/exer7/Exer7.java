package exer7;

import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite seu CPF: ");
        int cpf = sc.nextInt();
        
        System.out.println("\n---------------------");
        System.out.println("1 - Salvar valores com Paramêtro");
        System.out.println("2 - Salvar valores sem Paramêtro");
        System.out.print("Digite uma opção: ");
        int opcao = sc.nextInt();
        
        if (opcao == 1) {
            pessoa1.Pessoa1(nome, idade, cpf);
        
        } if (opcao == 2) {
            pessoa2.Pessoa2();
        }
       
    }
    
}
