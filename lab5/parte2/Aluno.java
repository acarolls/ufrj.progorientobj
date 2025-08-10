package lab5.parte2;

public class Aluno {
    String nome;
    String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }
    

}