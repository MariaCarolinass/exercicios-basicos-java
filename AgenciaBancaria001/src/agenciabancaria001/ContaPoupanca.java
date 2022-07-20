package agenciabancaria001;
public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int numConta, String dono, float saldo) {
        super(numConta, dono, saldo);
    }

    ContaPoupanca() {
    }

    @Override
    public int getNumConta() {
        return numConta;
    }

    @Override
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    @Override
    public String getDono() {
        return dono;
    }

    @Override
    public void setDono(String dono) {
        this.dono = dono;
    }

    @Override
    public float getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
