
public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private int idade;
    private Funcionario chefe;
    private double salario;

    public Funcionario(String nome, String cargo, int matricula, int idade, Funcionario chefe, double salario) {
        this.nome = nome; this.cargo = cargo; this.matricula = matricula; this.idade = idade; this.chefe = chefe; this.salario = salario;
    }

    public boolean mesmaChefia(Funcionario f) {
        if(this.chefe.equals(f.getChefe())) return true;

        return false;
    }
    
    @Override
    //TERMINAR ESSA PORRA AQUI!!!
    public boolean equals(Object obj){
        if(obj == this)
            return false;
        
        if(!(obj instanceof Funcionario)) //"Se obj *NÃO* é da classe Contato, então...
            return false; //...obviamente.
        
        Funcionario f = (Funcionario)obj; //Converte o objeto genérico obj para o tipo Contato.
        //A classe String tb herda de Object, daí tb tem seu próprio "equals()"!
        return this.chefe.equals(f.getChefe()) || this.getMatricula() == f.getMatricula();
    }
    public String getNome() {
        return this.nome;
    }

    public String getCargo() {
        return this.cargo;
    }
    
    public int getMatricula() {
        return this.matricula;
    }
    
    public int getIdade() {
        return this.idade;
    }

    public Funcionario getChefe() {
        return this.chefe;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setCargo(String c) {
        this.cargo = c;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }
    
    public void setIdade(int i) {
        this.idade = i;
    }

    public void setSalario(double s) {
        this.salario = s;
    }

}

