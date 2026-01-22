package Lista_02.src;

import java.awt.desktop.ScreenSleepEvent;
import java.util.HashMap;
import java.util.Scanner;

public class Busca_de_Prec {
    public static void main(String[] args) {
        HashMap<String , Double> produto = new HashMap<>();

        produto.put("Mouse", 60.00);
        produto.put("Fone", 120.00);
        produto.put("Mesa", 300.00);
        produto.put("Monitor", 1400.00);
        produto.put("CPU", 450.00);

        Scanner leitor = new Scanner(System.in);
        System.out.print("Escreva o nome do produto que deseja encontrar: ");
        String busca = leitor.nextLine();

        if (produto.containsKey(busca)) {
            Double preco = produto.get(busca);
            System.out.println("O preço do produto '" + busca + "' é: R$ " + preco);
        } else {
            System.out.println("Produto não encontrado.");
        }
        leitor.close();

    }
}
