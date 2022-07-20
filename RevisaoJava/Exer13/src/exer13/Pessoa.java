package exer13;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    double valorPagamento;
    private String[] contatos = new String[3];
    
    public abstract double realizarPagamento();

    public Pessoa(String nome, String endereco, double valorPagamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.valorPagamento = valorPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public String[] getContatos() {
        return contatos;
    }

    public void setContatos(String[] contatos) {
        this.contatos = contatos;
    }
        
    
}

