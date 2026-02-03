package Lista_Heranca.Exerci_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Aragorn", 10, 100, 85);
        Mago mago = new Mago("Gandalf", 20, 80, 150);

        guerreiro.receberDano(20);
        mago.receberDano(20);
        guerreiro.receberDano(40);

        System.out.println("vida atual "+ guerreiro.vida);
    }
}
