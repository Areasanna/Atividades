package Lista_02.src;

import java.util.Scanner;

public class Calculo_Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int N = leitor.nextInt();
        int fatorial = 1;
        int valorInicial = N;

        if (N < 0) {
            System.out.println("Não existe fatorial de número negativo.");
        } else {
            while (N > 1) {
                fatorial = fatorial * N;
                N--;
            }
            System.out.println("O fatorial de " + valorInicial + " é: " + fatorial);
        }
        leitor.close();
    }
}
