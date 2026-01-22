package Lista_02.src;

import java.util.Scanner;

public class Soma_de_Positivos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeros;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            numeros = leitor.nextInt();
            soma += numeros;
        } while (numeros != 0);

        System.out.println("Total da soma é: " + soma);
        leitor.close();
    }
}