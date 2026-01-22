package Lista_de_Classes.Exerc_2src;

public class Product {
    private String nome;
    private Double price;
    private int stockQuantity;

    public Product(String nome, Double price, int stockQuantity){

        this.nome = nome;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public void buy(int quantity) {
        if (quantity > 0 && (this.stockQuantity - quantity) >= 0) {
            this.stockQuantity -= quantity;
        } else {
            System.out.println("Erro: Estoque insuficiente ou quantidade inválida.");
        }
    }
    public void restock(int quantity) {
        if (quantity > 0) {
            this.stockQuantity += quantity;
        } else {
            System.out.println("Erro: A quantidade de reposição deve ser maior que zero.");
        }
    }
    public Double getTotalValue() {
        return this.price * this.stockQuantity;
    }
    public String getName() {
        return nome;
    }
    public Double getPrice(){
        return price;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
}
