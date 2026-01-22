package Lista_02.src;

import java.util.ArrayList;
import java.util.Scanner;
public class Menu_Interativo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList <String> Compras = new ArrayList<>();
        int opcao;
        String item;
        do{
            System.out.println("MENU");
            System.out.println("1 - Adicionar");
            System.out.println("2- listar");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma das opções: ");
            opcao = leitor.nextInt();

            leitor.nextLine();
            switch (opcao){

                case 1:
                    System.out.println("Novo item: ");
                    item = leitor.nextLine();
                    Compras.add(item);
                    System.out.println("Item adicionado.");
                break;
                case 2:
                    if(Compras.isEmpty()){
                        System.out.println("Lista vazia");
                    }else{
                        for(int i = 0; i<Compras.size(); i++){
                            System.out.println((i+1) + ". " + Compras.get(i));
                        }
                    }
                break;
                case 3:
                    System.out.println("Lista de compras feita!");
                break;

                default:
                    System.out.println("Opção Inválida. ");
            }


        }while(opcao != 3);
    }
}
