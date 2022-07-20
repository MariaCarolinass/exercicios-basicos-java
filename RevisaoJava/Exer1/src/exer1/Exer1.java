package exer1;

import java.util.Scanner;


public class Exer1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner var = new Scanner(System.in);
        float nota1;
        float nota2;
        float media;
        
        System.out.print("Digite a nota do 1° Bimestre (Com peso 2): ");
        nota1 = var.nextFloat();
        System.out.print("Digite a nota do 2° Bimestre (Com peso 3): ");
        nota2 = var.nextFloat();
        
        media = (((2 * nota1) + (3 * nota2)) / (2 + 3));
        
        System.out.println("Sua média dos bimestres é: "+media);
        
    }
    
}
