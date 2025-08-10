import java.util.*;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double op1, op2;
        char operacao;
        do {
            System.out.println("Operações disponíveis: ");
            System.out.println("Soma (+) |  Subtração (-) | Multiplicação (*) | Divisão (/)");
            operacao = sc.next().charAt(0);


            switch(operacao) {
                case '+': 
                System.out.print("Informe os dois operandos para realizar a soma: ");
                op1 = sc.nextDouble();
                op2 = sc.nextDouble();
                double soma = op1 + op2;
                System.out.println(soma);
                break;
                
                case '-':
                System.out.print("Informe os dois operandos para realizar a subtração: ");
                op1 = sc.nextDouble();
                op2 = sc.nextDouble();
                double subtracao = op1 - op2;
                System.out.println(subtracao);
                break;

                case '*':
                System.out.print("Informe os dois operandos para realizar a multiplicação: ");
                op1 = sc.nextDouble();
                op2 = sc.nextDouble();
                double multiplicacao = op1 * op2;
                System.out.println(multiplicacao);
                break;

                case '/':
                System.out.print("Informe os dois operandos para realizar a divisão: ");
                op1 = sc.nextDouble();
                op2 = sc.nextDouble();
                if(op2 == 0.0)  {
                    System.out.println("Não é possível realizar divisão por 0 (zero)!");
                    break;
                }
                double resultado = op1 / op2;
                System.out.println(resultado);
                break;
            }

        } while(operacao != 's' && operacao != 'S');

        sc.close();
    }
}