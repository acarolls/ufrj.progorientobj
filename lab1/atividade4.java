import java.util.*;

public class atividade4 {
    public static int fatorialRec(int num) {
        if(num == 1) return num;
        else return num*fatorialRec(num-1);
    }

    public static void main(String[] args) {
        int n, fatorial;        
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número para calcular seu fatorial: ");
        n = sc.nextInt();

        if(n<0 || n>20) {
            System.out.println("O número informado precisa ser entre 0 e 20!");
            System.exit(0);    
        }

        fatorial = fatorialRec(n);
        System.out.println("O fatorial de " + n + " é: " + fatorial + ".");
        sc.close();
    }

}
