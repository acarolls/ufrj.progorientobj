package lab4;

public class Gerente extends Funcionario {

    public Gerente(String nome, int mat, double sal, Funcionario chefe){
        super(nome, mat, sal, chefe);
    }

    @Override 
    public double bonus(Trimestre t){
        return (t == Trimestre._4o) ? this.getSalario() * 0.15 : bonus();
    }

    public double bonus() {
        return this.getSalario()*0.2;
    }
}    