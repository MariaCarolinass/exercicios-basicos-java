package exer14;
public class Carro implements ICarro{
    private double consumo;
    private double tanqueCombustivel;

    public Carro(double consumo, double tanqueCombustivel) {
        this.consumo = consumo;
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(double tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }

    @Override
    public void andar(double distancia) {
        if (this.tanqueCombustivel > 0) {
            System.out.println("Ande!");
        }
    }

    @Override
    public void abastecer(double quantidade) { 
        if (this.tanqueCombustivel < 0) {
            System.out.println("Abastecer!");
        }
    }

    @Override
    public double ConsultarTanque() {
        return this.getTanqueCombustivel();
    }
    
    
}
