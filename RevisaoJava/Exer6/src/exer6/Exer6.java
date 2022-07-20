package exer6;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner (System.in);
        
        int opcao = 0;
        
        while (opcao != 5) {
            System.out.println("----- Operações Matemáticas -----");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("5 - Sair");
        
            System.out.print("\n\nDigite uma opção: ");
            opcao = sc.nextInt();
        
            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor: ");
                    int operando1 = sc.nextInt();
                    System.out.print("Digite outro valor: ");
                    int operando2 = sc.nextInt();
                    calculadora.Somar(operando1, operando2);
                    System.out.println(calculadora.getSoma());                  
                    break;
                case 2 :
                    System.out.print("Digite um valor: ");
                    int minuendo = sc.nextInt();
                    System.out.print("Digite outro valor: ");
                    int subtraendo = sc.nextInt();
                    calculadora.Subtrair(minuendo, subtraendo);
                    System.out.println(calculadora.getSubtrair());
                    break;
                case 3:
                    System.out.print("Digite um valor: ");
                    int dividendo = sc.nextInt();
                    System.out.print("Digite outro valor: ");
                    int divisor = sc.nextInt();
                    calculadora.Dividir(dividendo, divisor);
                    System.out.println(calculadora.getDividir());
                    break;
                case 4:
                    System.out.print("Digite um valor: ");
                    int fator1 = sc.nextInt();
                    System.out.print("Digite outro valor: ");
                    int fator2 = sc.nextInt();
                    calculadora.Multiplicar(fator1, fator2);
                    System.out.println(calculadora.getMultiplicar());
                    break;
                 case 5:
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
