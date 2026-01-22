package Lista_de_Classes.Exerc_4src;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Rectangle rectangle1 = new Rectangle(5,7, 10, 15);
        System.out.println("Total da area: "+rectangle1.calculeArea());
        boolean contidos = rectangle1.contains(5,7);
        System.out.println("Os pontos estão contidos? "+contidos);
    }
}