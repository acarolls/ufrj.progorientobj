import java.util.*;

public class atividade3 {
    public static void main(String[] args) {
        final double pi = 3.14159;
        double raio;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do raio: ");
        raio = sc.nextDouble();
        double volume = (4.0/3.0) * pi * Math.pow(raio, 3);
        System.out.println("O volume da esfera é " + volume);
        sc.close();
    }

}