package Lista_01.src;

import java.util.Scanner;

public class exerc8 {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double p1 = leitor.nextDouble();

        System.out.println("Digite a nota 2: ");
        double p2 = leitor.nextDouble();

        System.out.println("Digite a nota 3: ");
        double p3 = leitor.nextDouble();

        double media = (p1+p2+p3) / 3;

        if(media >= 7.0){
            System.out.println("Aprovado");
        } else if(media >= 5.0 && media < 7.0){
            System.out.println("Recuperação");
        } else{
            System.out.println("Reprovado");
        }
        leitor.close();
    }
}
