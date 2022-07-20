/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerpooquadrado;

/**
 *
 * @author Carolina
 */
public class Quadrado {
    int lados;
    int area;
    int angulo;
    int vertices;
    int perimetro;
    int diagonal;
    
    void verificar() {
        if (this.lados == 4) {
        if (this.area == 1) 
        if (this.angulo == 90) 
        if (this.vertices == 4) 
        if (this.perimetro == 1) 
        if (this.diagonal == 2) 
        
        System.out.println("Parabéns! Você tem um quadrado perfeito.");
        
        } else 
            System.out.println("ERRO! O seu quadrado não é perfeito."); 
    }
}
