package Lista_01.src;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Arrays;
import java.util.Scanner;

public class exerc12{
    public static void main(String[]args){

        Scanner data = new Scanner(System.in);
        System.out.print("escreva o calculo: ");
        String caluculo = data.nextLine();

        String[]separado = caluculo.split(" ");

        int valorEsquerdo = Integer.parseInt(separado[0]);
        String operador = separado[1];
        int valorDireito = Integer.parseInt(separado[2]);
       int result=0;
       boolean operacaoValida = true;

        switch (operador){
            case "+":
                result = valorEsquerdo + valorDireito;
                break;
            case "-":
                result = valorEsquerdo - valorDireito;
            break;
            case "*":
                result = valorEsquerdo * valorDireito;
            break;
            case "/":
                if(valorDireito != 0){
                    result = valorEsquerdo / valorDireito;
                }else{
                    System.out.println("Erro!");
                    operacaoValida = false;
                }
            case "%":
                result = valorEsquerdo % valorDireito;
                break;

            default:
                System.out.println("Operador invalido");
                operacaoValida = false;
        }
        if (operacaoValida){
            System.out.println("Resultado: " + result);
        }

    data.close();

    }
}
