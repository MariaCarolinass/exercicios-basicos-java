package exer12;
public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String matricula, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
        this.matricula = matricula;
    }
    
    
}
