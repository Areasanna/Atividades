package Lista_02.src;

import java.util.Scanner;

public class Determinante {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int somaPrincipal=0;
        int somaSegundaria=0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("["+ i +"]["+ j +"]: ");
                matriz[i][j] = leitor.nextInt();
            }
        }
       for(int i = 0; i < 3; i++){
           somaPrincipal += matriz[i][i];
           somaSegundaria += matriz[i][3 - 1 - i];
       }
       int determinante = somaPrincipal - somaSegundaria;

       for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               System.out.println(matriz[i][j] + "\t");
           }
           System.out.println();
       }
        System.out.println("Determinante = "+determinante);

      leitor.close();
    }

}
