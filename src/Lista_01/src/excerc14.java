package Lista_01.src;

import java.util.Scanner;

public class excerc14 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("digite o peso em Kg: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite a altura em Metros: ");
        double altura = leitor.nextDouble();

        double imc = (peso / (altura*2));

        String classificacao;
        if(imc < 18.5){
            classificacao = "Abaixo do peso";
        } else if(imc >= 18.5 && imc <= 24.9){
            classificacao = "Peso normal";
        } else if(imc >= 25.0 && imc <= 29.9){
            classificacao = "Sobrepeso";
        } else{
            classificacao = "Obesidade";
        }

        System.out.println("Valor do índice de massa corporal:  "+ imc);
        System.out.println("Classificação: "+ classificacao);
    }
}
