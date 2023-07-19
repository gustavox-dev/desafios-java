package QuartoDesafio;

import java.util.Scanner;

public class DecifrarLinhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de casos de teste
        int numCases = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        for (int i = 0; i < numCases; i++) {
            // Leitura da frase a ser decifrada
            String line = scanner.nextLine();

            // Decifrar a frase e imprimir a saída
            String originalLine = decipherLine(line);
            System.out.println(originalLine);
        }
    }

    public static String decipherLine(String line) {
        int length = line.length();
        StringBuilder originalLine = new StringBuilder();

        // Decifrar a metade esquerda da linha
        for (int i = length / 2 - 1; i >= 0; i--) {
            originalLine.append(line.charAt(i));
        }

        // Decifrar a metade direita da linha
        for (int i = length - 1; i >= length / 2; i--) {
            originalLine.append(line.charAt(i));
        }

        return originalLine.toString();
    }
}
