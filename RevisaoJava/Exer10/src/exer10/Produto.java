package exer10;

import java.util.ArrayList;

class Produto extends Compra {
    private long codigo;
    private String nome;
    ArrayList<String> list = new ArrayList<>();
    
    public Produto(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Produto() {
    }
    
    
    public String consultaNome() {
        list.add(nome);
        return null;
        
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
