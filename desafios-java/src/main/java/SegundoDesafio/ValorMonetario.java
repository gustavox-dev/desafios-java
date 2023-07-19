package SegundoDesafio;

import java.util.*;

public class ValorMonetario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();

        System.out.println("NOTAS:");
        int[] notes = { 100, 50, 20, 10, 5, 2 };
        for (int note : notes) {
            int quantity = (int) (value / note);
            System.out.println(quantity + " nota(s) de R$ " + note + ".00");
            value %= note;
        }

        System.out.println("MOEDAS:");
        int[] coins = { 100, 50, 25, 10, 5, 1 };
        value *= 100;
        for (int coin : coins) {
            int quantity = (int) (value / coin);
            System.out.println(quantity + " moeda(s) de R$ " + (coin / 100.0));
            value %= coin;
        }
    }
}
