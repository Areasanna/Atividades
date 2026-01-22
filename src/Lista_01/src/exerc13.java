package Lista_01.src;

import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valorTotal = leitor.nextInt();
        int valorRestante = valorTotal;

        System.out.println("Valor a ser decomposto: R$ " + valorTotal);
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("Decomposição de R$ " + valorTotal + ":");
        for (int nota : notas) {
            int quantidade = valorRestante / nota;
            valorRestante = valorRestante % nota;

            if (quantidade >= 0) {
                System.out.println(quantidade + " nota(s) de R$ " + nota);
            }
        }
    }
}

