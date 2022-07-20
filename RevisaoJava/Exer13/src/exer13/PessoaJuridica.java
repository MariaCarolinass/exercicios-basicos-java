package exer13;
public class PessoaJuridica extends Pessoa {
    private int cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private double imposto;

    public PessoaJuridica(String nome, String endereco, double valorPagamento) {
        super(nome, endereco, valorPagamento);
    }

    public PessoaJuridica(int cnpj, String nomeFantasia, String razaoSocial, double imposto, String nome, String endereco, double valorPagamento) {
        super(nome, endereco, valorPagamento);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.imposto = 0.20;
    }
    
    @Override
    public double realizarPagamento() {
        this.imposto -= valorPagamento;
        return 0;
        
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    
}
