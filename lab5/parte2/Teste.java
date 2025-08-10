package lab5.parte2;

public class Teste {
    public static void main(String[] args) {
        Disciplina calculo1 = new Disciplina("Cálculo 1", "C1-20242");
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", "POO-20242");

        Aluno al1 = new Aluno("Ana Caroline", "123690590");
        Aluno al2 = new Aluno("Joao Vitor", "123597049");
        Aluno al3 = new Aluno("Daniel Goulart", "123596704");
        Aluno al4 = new Aluno("Ana Luisa", "123456789");
        
        calculo1.adicionarAluno(al1);
        poo.adicionarAluno(al1);
        calculo1.adicionarAluno(al2);
        calculo1.adicionarAluno(al3);
        calculo1.adicionarAluno(al4);
        poo.adicionarAluno(al3);

        calculo1.mostrarAlunos();
        calculo1.removerAluno(al4);

        calculo1.mostrarAlunos();
        poo.mostrarAlunos();

    

    }


}
