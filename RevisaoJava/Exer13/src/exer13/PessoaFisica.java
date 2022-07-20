package exer13;
public abstract class PessoaFisica extends Pessoa {
    private int cpf;
    private double imposto;

    public PessoaFisica(String nome, String endereco, double valorPagamento) {
        super(nome, endereco, valorPagamento);
    }

    public PessoaFisica(int cpf, double imposto, String nome, String endereco, double valorPagamento) {
        super(nome, endereco, valorPagamento);
        this.cpf = cpf;
        this.imposto = 0.10;
    }
    
    @Override
    public double realizarPagamento() {
        this.imposto -= valorPagamento;
        return 0;   
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    
    
    
}
