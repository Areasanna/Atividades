package Lista_01.src;

import java.util.Scanner;

public class exerc7 {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
        int verific = leitor.nextInt();

        if(verific % 2 == 0 && verific > 0) {
            System.out.println("Numero par e positivo");
        } else if (verific > 0 && verific % 2 != 0  ) {
            System.out.println("Numero positivo e ímpar");
        } else if (verific == 0) {
            System.out.println("Zero");
        } else{
            System.out.println("Negativo");
        }
    }
}
