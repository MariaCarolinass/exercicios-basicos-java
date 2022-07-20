package agenda;

public class ContatoPJ extends Contato{
   private String nomeRepresentante;
   private String telRepresentante;

    public ContatoPJ() {
        super();
    }   

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getTelRepresentante() {
        return telRepresentante;
    }

    public void setTelRepresentante(String telRepresentante) {
        this.telRepresentante = telRepresentante;
    }
    
}
