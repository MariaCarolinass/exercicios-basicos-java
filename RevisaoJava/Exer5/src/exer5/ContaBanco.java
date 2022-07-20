package exer5;
public class ContaBanco {
    private String nome;
    private int numConta;
    private float saldo = 100;

    public ContaBanco(String nome, int numConta, float saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    } 

    ContaBanco() {
    }
    
    public boolean sacar(float valorSaque) {
        if (valorSaque > this.saldo) {
            System.out.println("INVÁLIDO. Saque maior que o seu saldo!");
            return false;
        } else {
            this.saldo -= valorSaque;
            System.out.println("Saque de R$"+valorSaque+" Realizado com sucesso!");
            return true;
        }
    }
    public void depositar(float valorDep) {
        this.saldo += valorDep;
    }
    public float consultarSaldo(float saldo) {
        this.saldo = saldo;
        return this.saldo;
    }
    public String consultarNome(String nome) {
        this.nome = nome;
        return this.nome;
    }
    public String alterarNome(String nome) {
        this.nome = nome;
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
