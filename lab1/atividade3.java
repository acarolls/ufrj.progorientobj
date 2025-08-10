import java.util.*;

public class atividade3 {
    public static void main(String[] args) { //static significa que nao tem objeto
        double media, nota1, nota2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota do aluno: ");
        nota1 = sc.nextDouble();
        System.out.print("Informe a segunda nota do aluno: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2)/2;

        if(media >= 7.0) {
            System.out.println("O aluno está aprovado com média " + media + ".");
        } else if(media >= 3.0 && media < 7.0) {
            System.out.println("O aluno ficou com média " + media + " e precisa fazer prova final.");
        } else System.out.println("O aluno foi reprovado com média " + media + ".");
        sc.close();
    }
}
