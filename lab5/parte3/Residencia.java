package lab5.parte3;

import java.util.ArrayList;

public class Residencia {
    public int quant = 0;
    public String dono, endereco, cep;
    private ArrayList<Comodo> comodos;
    
    private class Comodo {
        private String nome;

        public Comodo(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return nome;
        }

    }

    public void adicionarComodo(String nomeComodo) {
        Comodo comodo = new Comodo(nomeComodo);
        comodos.add(comodo);
        quant++;
    }

    public void removerComodo(String nomeComodo) {
        if(quant == 1) {
            System.out.println("Não foi possível remover cômodo! A residência possui apenas um cômodo.");
            return;
        }
        for(int i = 0; i < comodos.size(); i++) {
            if(comodos.get(i).getNome().equals(nomeComodo)) {
                comodos.remove(i);
                System.out.println("O cômodo " + nomeComodo + " foi removido com sucesso!");
                quant--;
                return;
            }
        }
        System.out.println("Cômodo informado não foi encontrado na residência!");
    }

    public Residencia(String dono, String endereco, String cep, String primeiroComodo) {
        this.dono = dono;
        this.endereco = endereco;
        this.cep = cep;
        this.comodos = new ArrayList<>();
        adicionarComodo(primeiroComodo);
    }

    public void mostrarComodos() {
        System.out.println("Cômodos da casa do(a) " + this.dono + ":");
        for(int i = 0; i < comodos.size(); i++) {
            Comodo comodo = comodos.get(i);
            String nome = comodo.getNome();
            System.out.println(nome);
            
        }
    }
}
