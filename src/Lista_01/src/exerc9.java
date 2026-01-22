package Lista_01.src;

import java.util.Scanner;

public class exerc9 {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = leitor.nextLine();

        int cont=0;
        if(senha.length() >= 8){
           cont++;
        }
        if(senha.matches(".*[A-Z].*")){
            cont++;
        }
        if(senha.matches(".*[a-z].*")){
            cont++;
        }
        if(senha.matches(".*[0-9].*")){
            cont++;
        }
        if(senha.matches(".*[!@#$%&].*")){
            cont++;
        }

        String classificacao;
        if(cont >= 4){
            classificacao = "Forte";
        }else if(cont == 3 || cont == 2){
          classificacao = "Média";
        } else{
            classificacao = "Fraca";
        }

        System.out.println("Sua senha é: " + senha);
        System.out.println("Quatidade de criterios: " + cont);
        System.out.println("Classificação: " + classificacao);
    }
}
