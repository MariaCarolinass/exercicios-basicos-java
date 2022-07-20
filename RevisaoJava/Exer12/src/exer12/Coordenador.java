package exer12;
public class Coordenador extends Funcionario {
    private String curso;

    public Coordenador(String curso, String codigo, double salario, String nome, String cpf, String endereco) {
        super(codigo, salario, nome, cpf, endereco);
        this.curso = curso;
    }
    
    
}
