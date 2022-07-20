package agenda;

// Classe Agenda

import java.util.*;

public class Agenda implements IAgenda{
    //private Contato[] contatos; //Vetor para armazenar os contatos
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    private String dono; // Atributo para armazenar o nome do dono da Agenda
    //private int qntArmazenada = 0; // Variável para controlar a quantidade de contatos inseridos no vetor
    //private int capacidadeVetor = 0;
    
    // Construtor sem parâmetro
    public Agenda(){
        //contatos = new Contato[100]; // instancia o vetor com a capacidade de armazenamento de 100 contatos
        //capacidadeVetor = 100; // coloca a capacidade do vetor na variável
    }
    
    // Construtor com parâmetro - recebe um inteiro como parâmetro. Esse inteiro será a capacidade do vetor
    public Agenda(int capacidade){
        //contatos = new Contato[capacidade]; // instancia o vetor com a capacidade passada por parâmetro
        //capacidadeVetor = capacidade; // coloca a capacidade do vetor na variável
    }
    // MÉTODOS DE ACESSO
    // getter e setter do atributo dono
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    // Método de Inserir Contato no Vetor - Recebe um objeto do tipo Contato e Retorna um valor booleano que vai dizer se o contato foi inserido ou não
    public boolean inserirContato (Contato c){
        contatos.add(c);
        return true;
        //if(qntArmazenada != capacidadeVetor){ // Verifica se o vetor tem capacidade para armazenar mais contato
        //    contatos[qntArmazenada++] = c; // Insere o objeto recebido como parâmetro no vetor contatos no primeiro índice disponível. 
                                           // Em seguida, incrementa essa variável para armazenar o próximo índice disponível
        //    return true; // Retorna Verdadeiro, pois o contato foi inserido no vetor
        //}
        //return false; // Retorna Falso, pois o vetor não tem mais capacidade de armazenamento
    }
    
    // Método de Inserir Contato SOBRECARREGADO
    // Recebe três parâmetros para criar o objeto contato e retorna um booleano que vai dizer se o contato foi inserido ou não
    public boolean inserirContato(String nome, String telefone, String email){
        //if(qntArmazenada != capacidadeVetor){ // Verifica se o vetor tem capacidade para armazenar mais contato
            Contato c = new Contato(); // Criando o objeto do tipo contato para inserir no vetor
            c.setNome(nome); // Atribuindo valor ao nome do contato criado
            c.setTelefone(telefone); // Atribuindo valor ao telefone do contato criado
            c.setEmail(email); // Atribuindo valor ao e-mail do contato criado
            contatos.add(c);
           // contatos[qntArmazenada++] = c;// Insere o objeto recebido como parâmetro no vetor contatos no primeiro índice disponível. 
                                           // Em seguida, incrementa essa variável para armazenar o próximo índice disponível
            return true; // Retorna Verdadeiro, pois o contato foi inserido no vetor
       // }
       // return false; // Retorna Falso, pois o vetor não tem mais capacidade de armazenamento
    }
    
    // Método de Buscar Contato Por Nome - Recebe uma String correspondente ao nome do contato e Retorna o Contato encontrado ou null, caso não encontre
    // É válido observar que esse método só vai retornar o primeiro contato achado com o nome passado, ou seja, se for inserido contatos com mesmo nome,
    // ele só vai retornar o primeiro que foi inserido no vetor
    public Contato buscarContatoPorNome(String nome){
        for (int i = 0; i < contatos.size(); i++) { // Laço para percorrer o vetor
            if(contatos.get(i).getNome().trim().equalsIgnoreCase(nome)) // Verifica se o nome do contato do índice i tem o mesmo nome do recebido por parâmetro
                                                                    // OBSERVAÇÃO: O Método trim() elimina espaços em branco antes e depois da string
                return contatos.get(i); // Retorna o contato encontrado
        }
        return null; // Retorna objeto nulo, caso não encontre contato com o nome passado por parâmetro
    }
    
    // Método de Buscar Contato Por Telefone - Recebe uma String correspondente ao telefone do contato e Retorna o Contato encontrado ou null, caso não encontre
    // É válido observar que esse método só vai retornar o primeiro contato achado com o telefone passado, ou seja, se for inserido contatos com mesmo telefone,
    // ele só vai retornar o primeiro que foi inserido no vetor
    public Contato buscarContatoPorTelefone(String tel){
        for (int i = 0; i < contatos.size(); i++) { // Laço para percorrer o vetor
            if(contatos.get(i).getTelefone().trim().equalsIgnoreCase(tel)) // Verifica se o telefone do contato do índice i tem o mesmo telefone do recebido por parâmetro
                                                                       // OBSERVAÇÃO: O Método trim() elimina espaços em branco antes e depois da string
                return contatos.get(i); // Retorna o contato encontrado
        }
        return null; // Retorna objeto nulo, caso não encontre contato com o telefone passado por parâmetro
    }
    
    // Método de Buscar Contato Por E-mail - Recebe uma String correspondente ao e-mail do contato e Retorna o Contato encontrado ou null, caso não encontre
    // É válido observar que esse método só vai retornar o primeiro contato achado com o e-mail passado, ou seja, se for inserido contatos com mesmo e-mail,
    // ele só vai retornar o primeiro que foi inserido no vetor
    public Contato buscarContatoPorEmail(String email){
        for (int i = 0; i < contatos.size(); i++) { // Laço para percorrer o vetor
            if(contatos.get(i).getEmail().trim().equalsIgnoreCase(email)) // Verifica se o telefone do contato do índice i tem o mesmo telefone do recebido por parâmetro
                                                                       // OBSERVAÇÃO: O Método trim() elimina espaços em branco antes e depois da string
                return contatos.get(i);  // Retorna o contato encontrado
        }
        return null; // Retorna objeto nulo, caso não encontre contato com o telefone passado por parâmetro
    }
    
    // Método de Listar Contatos - Retorna o vetor de contatos
    public Contato[] listarContatos(){
        return (Contato[])contatos.toArray(); // Retorna o vetor de contatos
    }
    
    // Método de Listar Contatos - Retorna uma String
    public String toString(){
        String lista = new String(); // String que irá ser retornada
        for (int i = 0; i < contatos.size(); i++) { // Laço para percorrer o vetor
            // Inserindo os dados dos contatos na String lista
            if(contatos.get(i) instanceof ContatoPF){
                lista = lista + "Nome: "+contatos.get(i).getNome() 
                        + "\tTelefone: "+ contatos.get(i).getTelefone() 
                        + "\tE-mail: "+contatos.get(i).getEmail();
            }
            else{
                lista = lista + "Nome: "+contatos.get(i).getNome() 
                        + "\tTelefone: "+ contatos.get(i).getTelefone() 
                        + "\tE-mail: "+contatos.get(i).getEmail()
                          +"\tNome do representante: "+ ((ContatoPJ)contatos.get(i)).getNomeRepresentante()
                          +"\tTelefone do representante: "+((ContatoPJ)contatos.get(i)).getTelRepresentante();             
            }
    }
        return lista; // Retorna a String lista
    }
    
    public Contato removerContato(int i){
        return contatos.remove(i);
    }
    
    public boolean removerContato(Contato c){
        return contatos.remove(c);
    }
    
    public void removerTudo(){
        contatos.removeAll(contatos);
    }
    
    public void adicionar(ArrayList<Contato> list){
        contatos.addAll(list);
    }
}
