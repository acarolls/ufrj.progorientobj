class Funcionario {
    //atributos de objeto
    private String nome;
    private double salarioHora;
    private final int ID_FUNC;
    private double horasTrabalhadasMes;

    //atributos de classe    
    private static int proxID = 1;
    public static final double SALARIO_HORA_MINIMO = 12.50;
    
    //método construtivo 1 (não precisam ter void na declaração!)
    public Funcionario(String nome) {
        this.nome = nome;
        this.horasTrabalhadasMes = 0;
        this.salarioHora = SALARIO_HORA_MINIMO;
        this.ID_FUNC = proxID++;
    }
    
    //método construtivo 2
    public Funcionario(String nome, double salarioHora) {
        this.nome = nome;
        this.salarioHora = salarioHora;
        this.ID_FUNC = proxID++;
    }

    //getter ou acessador 
    public String getNome() {
        return nome;
    }

    //getter ou acessador 
    public int getID() {
        return ID_FUNC;
    }

    //getter ou acessador 
    public double getSalarioHora() {
        return salarioHora;
    }

    public double calculaSalarioMes() {
        return this.horasTrabalhadasMes * this.salarioHora;
    }

    public void reiniciaMesTrabalho() {
        this.horasTrabalhadasMes = 0;
    }

    public void atualizaNomes(String nome) {
        //Verifica se o novo nome tem pelo menos duas palavras
        if(nome.trim().split("\\s+").length >= 2) //trim() remove espaços em branco no inicio e no fim, split("\\s+") divide a string em partes sempre que encontra um ou mais espaços em branco
            this.nome = nome;
    }

    public void atualizaSalarioHora(double salarioHora) {
        if(salarioHora > this.salarioHora) {
            this.salarioHora = salarioHora;
        }
    }

    //getter ou acessador 
    public static int getProximoID() {
        return proxID;
    }

    public void adicionaDiaDeTrabalho(double horasTrabalhadas) {
        if(horasTrabalhadas >= 4) {
            this.horasTrabalhadasMes += horasTrabalhadas;
        } else {
            System.out.println("O dia de trabalho tem que ter pelo menos 4 horas completas para ser válido!");
        }
    }
}


public class exercicio4 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Ana Caroline");
        Funcionario func2 = new Funcionario("Ronald Chiesse", 15.0);     
        
        // Testando métodos
        func1.adicionaDiaDeTrabalho(5);
        func1.atualizaSalarioHora(20.0);
        func1.calculaSalarioMes();
        System.out.println("Salário do mês de " + func1.getNome() + ": R$ " + func1.calculaSalarioMes());

        func1.atualizaNomes("Ana Caroline Lira");
        System.out.println("Nome atualizado: " + func1.getNome());

        func2.atualizaSalarioHora(20.0);
        System.out.println("Novo salário por hora de " + func2.getNome() + ": R$ " + func2.getSalarioHora());
    }

}

