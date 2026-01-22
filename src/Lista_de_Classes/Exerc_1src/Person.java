package Lista_de_Classes.Exerc_1src;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String id;
    private String name;
    private String email;
    private String cpf;
    private LocalDate birthDate;
    private int weight;
    private int height;

    // Construtor: Inicializa todos os atributos e valida os dados essenciais
    public Person(String id, String name, String email, String cpf, LocalDate birthDate, int weight, int height) {
        validateName(name);
        validateEmail(email);
        validateCPF(cpf);

        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
    }

    // --- Métodos de Validação ---

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
    }
    private void validateEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Email inválido. Deve conter '@' e '.'.");
        }
    }
    private void validateCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF deve conter exatamente 11 dígitos.");
        }
    }
    public int calculateAge(LocalDate currentDate) {
        return Period.between(this.birthDate, currentDate).getYears();
    }
    public double calculateIMC() {
        double weightKg = this.weight / 1000.0; // converte gramas para kg
        double heightMeters = this.height / 100.0; // converte cm para metros

        return weightKg / (heightMeters * heightMeters);
    }

    public String getId() {
        return id; }
    public String getName() {
        return name; }
    public String getEmail() {
        return email; }
    public String getCpf() {
        return cpf; }
    public LocalDate getBirthDate() {
        return birthDate; }
    public int getWeight() {
        return weight; }
    public int getHeight() {
        return height; }

    public void setName(String name) {
        validateName(name);
        this.name = name;
    }
}