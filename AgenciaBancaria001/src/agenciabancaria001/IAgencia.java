package agenciabancaria001;
public interface IAgencia {
    public void abrirConta(Conta a);
    public Conta buscarConta(int numConta);
    public void fecharConta(int numConta);
}
