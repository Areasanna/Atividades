package Lista_de_Classes.Exerc_5src;

public class Main {
    public static void main(String[] args) {

        Circle meuCirculo = new Circle(0.0, 0.0, 5.0);
        System.out.printf("A área do círculo é: %.2f%n", meuCirculo.calculateArea());
        double pontoAX = 2.0;
        double pontoAY = 2.0;
        System.out.println("Os estão contidos? "+ meuCirculo.contains(pontoAX, pontoAY));
        double pontoBX = 6.0;
        double pontoBY = 0.0;
        System.out.println("Os pontos estão contidos? " + meuCirculo.contains(pontoBX, pontoBY));
        System.out.println("O ponto (5,0) está na borda/dentro? " + meuCirculo.contains(5, 0));
    }
}