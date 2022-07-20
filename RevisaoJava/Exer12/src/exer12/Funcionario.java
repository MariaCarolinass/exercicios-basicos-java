package exer12;
public class Funcionario extends Pessoa {
    private String codigo;
    private double salario;

    public Funcionario(String codigo, double salario, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.codigo = codigo;
        this.salario = salario;
    }

    
}
