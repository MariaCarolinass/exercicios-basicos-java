package agenda;

// Classe Contato
public class Contato {
    protected String nome; // Atributo para armazenar o nome do contato
    protected String telefone; // Atributo para armazenar o telefone do contato
    protected String email; // Atributo para armazenar o e-mail do contato
    
    // CONSTRUTORES
    // Construtor sem parâmetro - Apenas constrói o objeto
    public Contato() {
    }
    // Construtor com parâmetro - Recebe três parâmetros referentes aos atributos da classe
    public Contato(String nome, String telefone, String email) {
        this.nome = nome; // Atribui o valor do parâmetro ao atributo de classe
        this.telefone = telefone; // Atribui o valor do parâmetro ao atributo de classe
        this.email = email; // Atribui o valor do parâmetro ao atributo de classe
    }

    // MÉTODOS DE ACESSO - GETTERS E SETTERS
    //  getter e setter para o atributo nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //  getter e setter para o atributo telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    //  getter e setter para o atributo email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
  
}
