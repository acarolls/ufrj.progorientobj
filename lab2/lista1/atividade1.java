import java.util.*;

public class atividade1 {
    public static void main(String[] args) {
        double nota = 0, media = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as notas da turma: ");

        int i = 0;
        
        while(true) {
            nota = sc.nextDouble();
            if(nota == -1) break;
            i++;
            media += nota;
        }

        media /= i;
        
        System.out.println("A média da turma foi " + media + ".");
        sc.close();
    }

}