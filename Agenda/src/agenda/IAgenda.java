package agenda;

// Interface IAgenda que será implementada pela classe Agenda
public interface IAgenda {
    public boolean inserirContato (Contato c);
    public Contato buscarContatoPorNome(String nome);
    public Contato buscarContatoPorTelefone(String tel);
    public Contato buscarContatoPorEmail(String email);
    public Contato[] listarContatos();
}
