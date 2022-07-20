package ifrn.sc.info.modelo;



import java.util.ArrayList;

class Endereco {
    private String logradouro;
    private String Cidade;
    private String estado;
    ArrayList<String> list = new ArrayList<>();

    public Endereco(String logradouro, String Cidade, String estado) {
        this.logradouro = logradouro;
        this.Cidade = Cidade;
        this.estado = estado;
    }

    public Endereco() {
    }
    
    public String consultarLogradouro() {
        list.add(logradouro);
        return null;
        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
