package Lista_01.src;

import java.util.Scanner;

public class exerc2 {
    public static void main(String[]args){

        int a = 6;
        int b = 10;
        System.out.println("Valor de A " + a);
        System.out.println("Valor de B " + b);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo valor de A: ");
        int tempA = scanner.nextInt();
        System.out.print("Digite o novo valor de B: ");
        int tempB = scanner.nextInt();

        System.out.println("Novo valor de A " + tempA);
        System.out.println("Novo valor de B " + tempB);



    }
}
