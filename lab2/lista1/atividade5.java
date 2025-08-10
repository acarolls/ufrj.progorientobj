import java.util.*;

public class atividade5 {
    public static void main(String[] args) {
        final double eficiencia = 12.0;
        Scanner sc = new Scanner(System.in);
        double tempo, velocidade, distanciaPercorrida, quantidadeLitros;

        System.out.print("Informe o tempo gasto na viagem (em horas): ");
        tempo = sc.nextDouble();
        System.out.print("Informe a velocidade média na viagem (em km/h): ");
        velocidade = sc.nextDouble();

        distanciaPercorrida = velocidade * tempo; 
        quantidadeLitros = distanciaPercorrida / eficiencia;

        System.out.printf("\n");
        System.out.printf("Serão necessários %.3f litros de combustível.\n",  quantidadeLitros);

        sc.close();
    }
}