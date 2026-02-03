package Lista_Heranca.Exerci_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> personagems = new ArrayList<>();

        personagems.add(new Guerreiro("Aragorn", 10, 100, 85));
        personagems.add(new Mago("Gandalf", 20, 80, 150));

        for(Personagem p : personagems){
            p.exibirFicha();
        }
    }
}
