package exer6;
public class Calculadora {
    private int soma;
    private int subtrair;
    private int dividir;
    private int multiplicar;
    
    public Calculadora() {
    }

    public Calculadora(int soma, int subtrair, int dividir, int multiplicar) {
        this.soma = soma;
        this.subtrair = subtrair;
        this.dividir = dividir;
        this.multiplicar = multiplicar;
    }
    
    
    public void Somar(int operando1, int operando2) {
        this.soma = operando1 += operando2;
    }
    
    public void Subtrair(int minuendo, int subtraendo) {
        this.subtrair = minuendo -= subtraendo;
    }
    
    public void Dividir(int dividendo, int divisor) {
        this.dividir = dividendo /= divisor;
    }
    
    public void Multiplicar(int fator1, int fator2) {
        this.multiplicar = fator1 *= fator2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getSubtrair() {
        return subtrair;
    }

    public void setSubtrair(int subtrair) {
        this.subtrair = subtrair;
    }

    public int getDividir() {
        return dividir;
    }

    public void setDividir(int dividir) {
        this.dividir = dividir;
    }

    public int getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(int multiplicar) {
        this.multiplicar = multiplicar;
    }  

}
