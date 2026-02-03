package Lista_Heranca.Exerci_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> grupoDeAventura = new ArrayList<>();
        grupoDeAventura.add(new Guerreiro("Aragorn", 10, 100, 80));
        grupoDeAventura.add(new Mago("Gandalf", 20, 80, 150));
        grupoDeAventura.add(new Guerreiro("Gimli", 8, 120, 90));
        grupoDeAventura.add(new Mago("Saruman", 18, 90, 200));

        for(Personagem p: grupoDeAventura){
            p.usarHabilidade();
        }
    }
}
