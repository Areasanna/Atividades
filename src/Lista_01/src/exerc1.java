package Lista_01.src;

import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {

            Scanner num = new Scanner(System.in);
            double raio = num.nextInt();
            double area = Math.PI * Math.pow(raio, 2);

            System.out.println("O valor da area e: " + area);

            System.out.printf("Area formatada: %.2f%n", area);
        }
    }