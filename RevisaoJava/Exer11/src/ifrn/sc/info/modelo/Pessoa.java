package ifrn.sc.info.modelo;



import ifrn.sc.info.negocio.Compra;
import java.util.ArrayList;

public class Pessoa extends Compra {
    private String nome;
    private Endereco edereco;
    private String numero;
    ArrayList<String> list = new ArrayList<>();
    
    public Pessoa(String nome, Endereco edereco, String numero) {
        this.nome = nome;
        this.edereco = edereco;
        this.numero = numero;
    }

    public Pessoa() {
    }
    
    
    public Endereco consultaEndereco(String endereco) {
        list.add(endereco);
        return null;
        
    }
    
    public String consultarNome() {
        list.add(nome);
        return null;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEdereco() {
        return edereco;
    }

    public void setEdereco(Endereco edereco) {
        this.edereco = edereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
}
