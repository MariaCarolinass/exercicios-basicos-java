package exer7;
public class Pessoa {
    private String nome;
    private int idade, cpf;

    public Pessoa(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa() {
    }
    
    public void Pessoa1 (String nome, int idade, int cpf) {
        this.nome = nome; 
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public void Pessoa2 () {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
}
