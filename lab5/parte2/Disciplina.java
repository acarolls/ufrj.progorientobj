package lab5.parte2;

import java.util.ArrayList;

public class Disciplina {
    int quant = 0;
    String nome, codigo;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void adicionarAluno(Aluno al) {
        alunos.add(al);
        quant++;
    }

    public void removerAluno(Aluno al) {
        alunos.remove(al);
        quant--;
    }

    public int quantidadeAlunos() {
        return quant;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void mostrarAlunos() {
        System.out.printf("\n");
        System.out.println( quant + " Alunos(as) da disciplina de " + this.nome + ":");
        for(int i = 0; i < alunos.size(); i++) {
            Aluno al = alunos.get(i);

            String nome = al.getNome();
            String matricula = al.getMatricula();

            System.out.println("Nome: " + nome + " | Matrícula: " + matricula);
        }
    }
    
}
