package exer10;
public class Compra extends Pessoa{
    private Pessoa pessoa;
    private Produto produto;
    Pessoa pe = new Pessoa();
    Produto pro = new Produto();
    
    public Compra(Pessoa pessoa, Produto produto, String nome, Endereco edereco, String numero) {
        super(nome, edereco, numero);
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Compra(Pessoa pessoa, Produto produto) {
        this.pessoa = pessoa;
        this.produto = produto;
    }

    public Compra() {
    }
    
    public void comprar(Pessoa pessoa, Produto produto) {
        this.getProduto();
        this.getPessoa();
    }
    
    public String verificarCompra() {
        this.getPessoa();
        this.getProduto();
        return null;
        
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
