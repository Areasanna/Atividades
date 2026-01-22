package Lista_01.src;

import java.util.Scanner;

public class excerc15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double saltoAtual = (Math.random() * 2000);

        System.out.println("MENU BANCÁRIO");
        System.out.println("1- Depósito | 2- Saque | 3- Consulta");
        System.out.print("Escolha um das opções: ");
        int transacao = leitor.nextInt();

        double valor;
        switch (transacao){

            case 1:
                System.out.print("Valor do depósito:R$ ");
                valor = leitor.nextDouble();
                saltoAtual = (saltoAtual+valor);
                System.out.println("R$ "+saltoAtual);
                break;
            case 2:
                System.out.println("Valor do saque: R$ ");
                valor = leitor.nextDouble();
                if(saltoAtual >= valor){
                    saltoAtual = (saltoAtual-valor);
                    System.out.println("Saldo atual: R$ "+saltoAtual);

                } else{
                    System.out.println("Salto insuficiente");
                }
                break;
            case 3:
                System.out.println("Saldo Atual:R$ "+saltoAtual);
                break;
            default:
                System.out.println("Opção invalida");

        }


    }
}
