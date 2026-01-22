package Lista_de_Classes.Exerc_2src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Arros", 23.90, 4);

        System.out.println("Nome"+product1.getName());
        System.out.println("Preço: R$"+product1.getPrice());
        System.out.println("Quantidade do produto: "+product1.getStockQuantity());
        System.out.println("Valor total: "+product1.getTotalValue());
    }
}
