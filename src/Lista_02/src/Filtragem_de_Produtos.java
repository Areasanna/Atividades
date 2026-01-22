package Lista_02.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Filtragem_de_Produtos {
    public static void main(String[] args) {
        HashMap<String, Double> produto = new HashMap<>();

        produto.put("Mouse", 50.00);
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
        for (Map.Entry<String, Double> entrada : produto.entrySet()) {
            String nome = entrada.getKey();
            Double preco = entrada.getValue();

            if (preco > 50.00) {
                System.out.printf("Produto: %-12s | Preço: R$ %.2f%n", nome, preco);
                leitor.close();
            }
        }
    }
}
