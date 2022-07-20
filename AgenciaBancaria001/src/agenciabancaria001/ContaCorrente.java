package agenciabancaria001;
public class ContaCorrente extends Conta {
    private int limite;

    ContaCorrente() {
    }

    @Override
    public String toString() {
        return "O seu limite da Conta Corrente é:" + "R$" + limite + '}';
    }

    public ContaCorrente(int limite) {
        this.limite = 100;
    }

    public ContaCorrente(int limite, int numConta, String dono, float saldo) {
        super(numConta, dono, saldo);
        this.limite = 100;
    }

    public void sacar(double valor) {
        if (this.saldo + this.limite >= valor ) {
            this.saldo = (float) ((this.saldo - valor));
        }
    }

    
    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
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
