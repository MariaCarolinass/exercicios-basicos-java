package exer3;

import java.util.Scanner;

public class Exer3 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        
        Scanner var = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        frase = var.nextLine();
        
        System.out.println("O número de caracteres é: "+frase.length());
          
        int cont = 0;
        for (int i = 0; i < frase.length(); i++)
            if (frase.charAt(i) == 'a' | frase.charAt(i) == 'A')
                cont ++;
                System.out.println("A quantidade de n° 'a' é: "+cont++);
    }
}
