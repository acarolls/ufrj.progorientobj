import java.util.*;


class atividade1 {
    public static void main(String[] args) {
        final double pi = 3.14159; // ou float pi = 3.14159f
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do primeiro raio: ");
        double R = sc.nextDouble();
        System.out.println("Informe o valor do seguindo raio: ");
        double r = sc.nextDouble();
        double coroa = pi * (R*R - r*r);
        System.out.println("O valor da área da coroa circular é: " + coroa);
        sc.close();
    }
}

