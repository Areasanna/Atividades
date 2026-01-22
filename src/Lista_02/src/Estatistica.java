package Lista_02.src;

import java.util.Scanner;

public class Estatistica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] vetor = new int [10];
        int menor = vetor[0];
        int maior = vetor[0];
        float soma = 0;
        float media = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("["+ i + "]");
            vetor[i] = leitor.nextInt();

            if(vetor[i] == 1){
                maior = vetor[i];
                menor = vetor [i];
            } else{
                if(vetor[i] > maior){
                    maior = vetor[i];
                }
                if (vetor[i] < menor){
                    menor = vetor[i];
                }
            }
            soma += vetor[i];
            media = (soma / 10);
        }
        System.out.println("Maior valor = "+ maior);
        System.out.println("Menor valor=  "+ menor );
        System.out.println("Soma dos valores = "+ soma);
        System.out.println("Media dos valores= "+media);

    }
}
