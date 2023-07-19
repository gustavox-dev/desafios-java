package PrimeiroDesafio;

import java.util.*;

public class ordenacaoValoresInteiros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }
        Collections.sort(evenNumbers);

        Collections.sort(oddNumbers, Comparator.reverseOrder());

        for (int even : evenNumbers) {
            System.out.println(even);
        }

        for (int odd : oddNumbers) {
            System.out.println(odd);
        }
    }
}
