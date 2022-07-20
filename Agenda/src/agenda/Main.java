package agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda ag = new Agenda();
        System.out.println("BEM-VINDO AO SISTEMA DE AGENDA DE CONTATOS!");
        System.out.println("Digite o seu nome:");
        ag.setDono(sc.nextLine());
        int opcao = 0;
        do{
            System.out.println("\n\n\n\n AGENDA DE CONTATOS DE "+ag.getDono());
            System.out.println("\n1 - INSERIR CONTATO");
            System.out.println("2 - INSERIR CONTATO (método sobrecarregado)");
            System.out.println("3 - BUSCAR CONTATO POR NOME");
            System.out.println("4 - BUSCAR CONTATO POR TELEFONE");
            System.out.println("5 - BUSCAR CONTATO POR E-MAIL");
            System.out.println("6 - LISTAR CONTATOS");
            System.out.println("7 - LISTAR CONTATOS (método toString())");
            System.out.println("0 - SAIR");
            System.out.println("\nDigite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            
            switch(opcao){
                case 1:
                        Contato novo;
                        System.out.println("Qual o tipo de contato que deseja inserir?");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        int op = Integer.parseInt(sc.nextLine());
                        if(op == 1){
                            novo = new ContatoPF();
                            System.out.println("Digite o nome do contato: ");
                            novo.setNome(sc.nextLine());
                            System.out.println("Digite o telefone do contato: ");
                            novo.setTelefone(sc.nextLine());
                            System.out.println("Digite o e-mail do contato: ");
                            novo.setEmail(sc.nextLine());
                        }
                        else{
                            novo = new ContatoPJ();
                            System.out.println("Digite o nome da empresa: ");
                            novo.setNome(sc.nextLine());
                            System.out.println("Digite o telefone da empresa: ");
                            novo.setTelefone(sc.nextLine());
                            System.out.println("Digite o e-mail do contato: ");
                            novo.setEmail(sc.nextLine());
                            System.out.println("Digite o nome do representante: ");
                            ((ContatoPJ)novo).setNomeRepresentante(sc.nextLine());
                            System.out.println("Digite o telefone do representante: ");
                            ((ContatoPJ)novo).setTelRepresentante(sc.nextLine());
                        }
                           
                        if(ag.inserirContato(novo) == true)
                            System.out.println("Contato inserido com sucesso!");
                        else
                            System.out.println("Não foi possível inserir o contato na agenda. Capacidade máxima atingida.");
                        break;
                case 2:
                        System.out.println("Digite o nome do contato: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite o telefone do contato: ");
                        String tel = sc.nextLine();
                        System.out.println("Digite o e-mail do contato: ");
                        String email = sc.nextLine();
                        if(ag.inserirContato(nome, tel, email) == true)
                            System.out.println("Contato inserido com sucesso!");
                        else
                            System.out.println("Não foi possível inserir o contato na agenda. Capacidade máxima atingida.");
                        break;
                case 3:
                        System.out.println("Digite o nome do contato que deseja buscar: ");
                        String n = sc.nextLine();
                        Contato c = ag.buscarContatoPorNome(n);
                        if( c != null){
                            System.out.println("Nome: "+c.getNome());
                            System.out.println("Telefone: "+c.getTelefone());
                            System.out.println("E-mail: "+c.getEmail());
                        }else{
                            System.out.println("Contato não encontrado!");
                        }
                        break;
                case 4:
                        System.out.println("Digite o telefone do contato que deseja buscar: ");
                        String t = sc.nextLine();
                        Contato c1 = ag.buscarContatoPorTelefone(t);
                        if( c1 != null){
                            System.out.println("Nome: "+c1.getNome());
                            System.out.println("Telefone: "+c1.getTelefone());
                            System.out.println("E-mail: "+c1.getEmail());
                        }else{
                            System.out.println("Contato não encontrado!");
                        }
                        break;
                case 5:
                        System.out.println("Digite o e-mail do contato que deseja buscar: ");
                        String e = sc.nextLine();
                        Contato c2 = ag.buscarContatoPorEmail(e);
                        if( c2 != null){
                            System.out.println("Nome: "+c2.getNome());
                            System.out.println("Telefone: "+c2.getTelefone());
                            System.out.println("E-mail: "+c2.getEmail());
                        }else{
                            System.out.println("Contato não encontrado!");
                        }
                        break;
                case 6:
                        System.out.println("Lista de Contatos: ");
                        Contato[] contatos = ag.listarContatos();
                        for(int i = 0; i< contatos.length; i++){
                            System.out.println("Nome: "+contatos[i].getNome());
                            System.out.println("Telefone: "+contatos[i].getTelefone());
                            System.out.println("E-mail: "+contatos[i].getEmail()+"\n");
                        }
                        break;
                case 7:
                        System.out.println("Lista de Contatos (método toString()");
                        System.out.println(ag.toString());
                        break;
                case 0:
                        System.out.println("Tchau. Até breve! ;)");
                    break;
                default:System.out.println("Opção Incorreta! \nTente novamente");
                    break;
                
            }
            
        } while (opcao != 0);
        
    }
    
}
