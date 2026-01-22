package Lista_de_Classes.Exerc_1src;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("1", "João Silva", "joao@email.com", "12345678901",
                LocalDate.of(1995, 5, 20), 80000, 180);

        System.out.println("Nome: " + p1.getName());
        System.out.println("Idade: " + p1.calculateAge(LocalDate.now()) + " anos");
        System.out.printf("IMC: %.2f", p1.calculateIMC());
    }
}