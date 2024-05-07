import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaDeCores {
    public static void main(String[] args) {
        // Criando um ArrayList para armazenar cores
        ArrayList<String> cores = new ArrayList<>();

        // Criando um objeto Scanner para leitura de entradas
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que digite 5 cores
        System.out.println("Por favor, digite 5 cores:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Cor " + (i + 1) + ": ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        // Exibindo as cores adicionadas
        System.out.println("\nCores adicionadas:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Ordenando as cores em ordem crescente (alfabética)
        Collections.sort(cores);

        // Exibindo as cores ordenadas
        System.out.println("\nCores ordenadas em ordem alfabética:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Fechando o scanner
        scanner.close();
    }
}
