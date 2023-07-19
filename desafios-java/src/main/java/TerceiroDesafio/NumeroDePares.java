package TerceiroDesafio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumeroDePares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do tamanho do array e valor alvo
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Leitura do array de inteiros
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Encontrar o número de pares que satisfazem o critério
        int countPairs = countPairsWithDifference(arr, k);
        System.out.println(countPairs);
    }

    public static int countPairsWithDifference(int[] arr, int k) {
        // Criar um conjunto para armazenar os elementos únicos do array
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Verificar quantos pares satisfazem o critério
        int count = 0;
        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        return count;
    }
}
