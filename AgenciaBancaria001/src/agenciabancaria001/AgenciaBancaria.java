package agenciabancaria001;

import java.util.ArrayList;

public class AgenciaBancaria implements IAgencia {
    private ArrayList<Conta> contas = new ArrayList<>();

    public AgenciaBancaria() {
    }
    
    public void abrirConta(Conta a) {
        contas.add(a);
    }
    
    public void abrirConta(String dono, int numConta, float saldo) {
        Conta a = new Conta();
        a.setDono(dono);
        a.setNumConta(numConta);
        a.setSaldo(saldo);
        Conta.add(a);
    }
    
    public Conta buscarConta(int numConta) {
        for (Conta r : contas) {
            if(r.getNumConta() == numConta) {
                return r;
            }
        }
        return null;
    }
    
   
    public void fecharConta(int numConta) {
        Conta r = buscarConta(numConta);
        int indice = contas.indexOf(r);
        contas.remove(indice);
    }
    
    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    void setDono(String nextLine) {
    }

}