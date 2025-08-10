import java.util.*;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFrango, totalBife, totalMassa, f, b, m, pessoasSemRefeicao = 0;

        System.out.print("Informe a quantidade de refeições disponíveis para frango, bife e massa, respectivamente: ");
        totalFrango = sc.nextInt();
        totalBife = sc.nextInt();
        totalMassa = sc.nextInt();

        System.out.print("Informe o número de pessoas que escolheram frango, bife e massa, respectivamente: ");
        f = sc.nextInt();
        b = sc.nextInt();
        m = sc.nextInt();

        if(f > totalFrango) pessoasSemRefeicao += (f - totalFrango);
        if(b > totalBife) pessoasSemRefeicao += (b - totalBife);
        if(m > totalMassa) pessoasSemRefeicao += (m - totalMassa);

        System.out.println(pessoasSemRefeicao + " passageiros ficariam sem refeição.");
        sc.close();
    }
}