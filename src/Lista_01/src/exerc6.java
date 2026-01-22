package Lista_01.src;

import java.util.Scanner;

public class exerc6 {
  public static void main(String[]args){

      Scanner leitor = new Scanner(System.in);
      System.out.println("insira sua idade: ");
      int idade = leitor.nextInt();

      if(idade >= 18){
          System.out.println("Maior de idade");
      } else{
          System.out.println("Menor de idade");
      }

  }
}
