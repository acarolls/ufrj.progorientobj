import java.util.*;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe a sua altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.println("Nome: " + nome + ".");
        System.out.println("Idade: " + idade + " ano(s).");
        System.out.println("Altura: " + altura + " m.");    
        sc.close();        
    }

}
