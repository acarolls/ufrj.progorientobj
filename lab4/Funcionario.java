package lab4;

public class Funcionario {
    private String nome;
    private int matricula; 
    private double salario;
    private Funcionario chefe;

    public Funcionario(String n, int m, double s, Funcionario c){
        nome = n;
        matricula = m; 
        salario = s;
        chefe = c;
    }

    public double bonus(Trimestre t){
        return salario * 0.1;
    }
    
    public String getNome(){
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto é ele mesmo
        if (this == obj) return false;

        // Verifica se o objeto é uma instância da classe Funcionario
        if (obj == null || getClass() != obj.getClass()) return false;

        // Faz o cast do objeto para Funcionario
        Funcionario outro = (Funcionario) obj;

        // Compara as matriculas
        return matricula == outro.matricula;
    }


}
