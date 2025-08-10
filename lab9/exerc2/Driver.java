public class Driver {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana Caroline", null);
        //f1.setChefe(f1);
            
        Funcionario f2 = new Funcionario("Daniel Goulart", "Analista", 46512, 19, f1, 5000.0);
        try {
        f2.setChefe(f2);

        } catch(ChefeInvalidoException e) {
            System.out.println("Erro: um funcionário não pode ser chefe de si mesmo.");
        }
    }
}

/*
c) O código executa, mas recebe o erro abaixo. O método setChefe joga um erro para onde ele é utilizado, visto que o chefe a ser settado é o mesmo funcionário. Visto que é um erro unchecked, ele não precisa ser tratado na hora, sendo a JVM responsável por indicá-lo.

Exception in thread "main" java.lang.RuntimeException
	at Funcionario.setChefe(Funcionario.java:82)
	at Driver.main(Driver.java:4)

d)
O código compila e roda normalmente (a main capta o erro e imprime um aviso na tela). Houve o tratamento do erro na driver class.

e) O código não compila porque checked exceptions devem ser tratadas pelo método chamador ou devem ser lançadas.


*/
