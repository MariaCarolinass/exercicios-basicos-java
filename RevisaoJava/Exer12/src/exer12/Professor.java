package exer12;
public class Professor extends Funcionario {
    private String departamento;

    public Professor(String departamento, String codigo, double salario, String nome, String cpf, String endereco) {
        super(codigo, salario, nome, cpf, endereco);
        this.departamento = departamento;
    }
    
    
}
