package lab10;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class lab10 {
    public static void main(String[] args) {
        ArrayList<String> linhas = new ArrayList<>();

        // Lendo o arquivo "semana.txt" e armazenando as linhas
        try (Scanner scanner = new Scanner(new File("semana.txt"))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                linhas.add(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }

        // Escrevendo as linhas em ordem inversa em "inv_semana.txt"
        try (PrintWriter writer = new PrintWriter(new File("inv_semana.txt"))) {
            for (int i = linhas.size() - 1; i >= 0; i--) {  // Corrigido para percorrer em ordem inversa
                writer.println(linhas.get(i));  // Corrigido para escrever uma nova linha
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}