package exerpooquadrado;

import java.util.Scanner;

public class ExerPooQuadrado {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Scanner sc = new Scanner (System.in);
        System.out.println("----------"+" ANALISADOR DE QUADRADO "+"----------");
        System.out.print("Quantos lados tem o quadrado: ");
        q1.lados = sc.nextInt(); 
        System.out.println("----------"+" ANALISADOR DE QUADRADO "+"----------");
        System.out.print("Digite qual é o ângulo do quadrado para cada lado: ");
        q1.angulo = sc.nextInt();
        System.out.println("----------"+" ANALISADOR DE QUADRADO "+"----------");
        System.out.print("Digite quantos perimetros tem o quadrado para cada lado: ");
        q1.perimetro = sc.nextInt();
        System.out.println("----------"+" ANALISADOR DE QUADRADO "+"----------");
        System.out.print("Digite quantas vertices tem o quadrado para cada lado: ");
        q1.vertices = sc.nextInt();
        System.out.println("----------"+" ANALISADOR DE QUADRADO "+"----------");
        System.out.print("Digite quantas diagonais tem o quadrado para cada lado: ");
        q1.diagonal = sc.nextInt();
        System.out.println("----------"+" ANALISADOR DE QUADRADO "+"----------");
        System.out.print("Digite qual é a area do quadrado: ");
        q1.area = sc.nextInt();
        
        q1.verificar();
    }
    
}
