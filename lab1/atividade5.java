import java.util.*;

public class atividade5 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Informe os cinco números: ");
        for(int i=0; i<5; i++) {
            array[i] = sc.nextInt();           
        }

        for(int i=0; i<5; i++) {
            System.out.println(array[i]);            
        }
        sc.close();
    }
    
}
