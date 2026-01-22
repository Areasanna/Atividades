package Lista_01.src;

import java.util.Scanner;

public class exerc5 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de produto: ");
        int quantidade = scanner.nextInt();

        System.out.println("Valo do produto: ");
        double precoUnitatio = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Nome do produto: ");
        String nomePro = scanner.nextLine();

        float total = (float) (quantidade * precoUnitatio);

        System.out.println("O valor total para " + nomePro + " é R$ " + total);



    }
}
