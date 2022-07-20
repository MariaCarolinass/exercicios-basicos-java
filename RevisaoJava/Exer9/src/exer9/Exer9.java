package exer9;

import java.util.Scanner;

public class Exer9 {
    public static void main(String[] args) {
        // TODO code application logic here
            int[][] matrizA = new int[2][2];
            int[][] matrizB = new int[2][2];
            Integer matrizSoma[][] = new Integer[2][2] ;
            Scanner entrada = new Scanner(System.in);
            
            // Escolhendo os elementos
            // Matriz A
            for(int i=0 ; i < 2 ; i++){
                for(int j = 0; j < 2 ; j ++){
                    System.out.printf("Insira o elemento M[%d][%d]: ",i+1,j+1);
                    matrizA[i][j]=entrada.nextInt();
                }
            }
            
            for(int i=0 ; i < 2 ; i++){
                for(int j = 0; j < 2 ; j ++){
                    System.out.printf("\t %d \t",matrizA[i][j]);
                }
                System.out.println();
            }
            
            // Matriz B
            for(int i=0 ; i < 2 ; i++){
                for(int j = 0; j < 2 ; j ++){
                    System.out.printf("Insira o elemento M[%d][%d]: ",i+1,j+1);
                    matrizB[i][j]=entrada.nextInt();
                }
            }
            
            for(int i=0 ; i < 2 ; i++){
                for(int j = 0; j < 2 ; j ++){
                    System.out.printf("\t %d \t",matrizB[i][j]);
                }
                System.out.println();
            }
            
            System.out.println("\n\nSoma");
            // Soma 
            for (int i = 0 ; i < matrizA.length; i++) {
                for(int j = 0; j < matrizA.length; j++) { 
                    matrizSoma[i][j] = matrizA[i][j]+matrizB[i][j];
                    }
                }
            
            //imprimir soma
            for (int i = 0 ; i < matrizSoma.length;i++) {
		System.out.println("\n");
                for(int j = 0 ; j < matrizSoma.length;j++) {
                    System.out.print(matrizSoma[i][j]+"\t");
                }
            }
            System.out.println();
    }
}
