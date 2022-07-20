package agenciabancaria001;
public class Conta {
    
    static void add(Conta a) {
    }
    static void remove(Conta r) {
    }
    
    protected int numConta;
    protected String dono;
    protected float saldo;

    public String DadosDono() {
        String dados = new String();
        dados = "----------------------------------------------------\n";
        dados = dados + "Conta: "+ this.getNumConta()+"\n";
        dados = dados + "Dono: "+ this.getDono()+"\n";
        dados = dados + "Saldo: R$"+ this.getSaldo();
        return dados;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = (float) (this.saldo + valor);
        }
    }

    public void sacar(double valor) {
    
        if (this.saldo >= valor ) {
            this.saldo = (float) ((this.saldo - valor));
        }
    }
    
    public Conta() {
    }
    public Conta(int numConta, String dono, float saldo) {
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
}
