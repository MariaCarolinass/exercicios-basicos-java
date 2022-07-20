package exer8;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> numero = new ArrayList<Integer>();
        
        int maiorValorP = 0;
        int menorValorI = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um n°: ");
            int n = sc.nextInt();
            numero.add(n);

                
                if (n % 2 == 0) {
                    for (Integer valor1 : numero) {  
                        if (valor1 > maiorValorP) { 
                            maiorValorP = valor1;
                        }
                    }
                }
                else {
                    for (Integer valor2 : numero) {  
                        if (valor2 < menorValorI) {
                            menorValorI = valor2;
                        }                     
                        
                    }  
                }  
                      
        }

            System.out.println("Maior elemento Par: "+ maiorValorP);
            System.out.println("Menor elemento Ímpar: " + menorValorI);  
            
    }
}