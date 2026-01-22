package Lista_02.src;

import java.util.Scanner;

public class Crud_Basico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int [] dados = new int[5];
        int contadorElentos =0;
        int opcao= -1;

        do{
            System.out.println("--- MENU ---");
            System.out.println("1- Adicionar");
            System.out.println("2- Visualizar");
            System.out.println("3- Atualizar");
            System.out.println("4- remover");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma das opções: ");
            opcao = leitor.nextInt();

        switch (opcao) {

            case 1:
                if (contadorElentos < dados.length) {
                    System.out.println("Digite um numero: ");
                    dados[contadorElentos] = leitor.nextInt();
                    contadorElentos++;
                    System.out.println("Numero adicionado.");
                } else {
                    System.out.println("O array está cheio.");
                }
            break;
            case 2:
                for(int i = 0; i < contadorElentos; i++){
                    System.out.println("["+ i +"]: "+dados[i]);
                }
                break;

            case 3:
                System.out.print("Digite o índice que deseja atualizar: ");
                int indiceAtualizado = leitor.nextInt();

                if(indiceAtualizado >= 0 && indiceAtualizado < contadorElentos ){
                    System.out.print("Digite um novo valor: ");
                    dados[indiceAtualizado] = leitor.nextInt();
                    System.out.println("Valor atualizado.");
                }else{
                    System.out.println("Índice invalido");
                }
            break;

            case 4:
                System.out.println("Digiteo índice que deseja remover");
                int indiceRemove = leitor.nextInt();
                if(indiceRemove >=0 && indiceRemove < contadorElentos){
                    for(int i = indiceRemove; i < contadorElentos -1; i++){
                        dados[i] = dados[i+1];
                    }
                    contadorElentos--;
                    System.out.println(" Índice removido");
                }else{
                    System.out.println("índice invalido");
                }
            break;

            case 0:
                System.out.println("Saindo");
                break;

            default:
                System.out.println("Opção invalida");
         }
        } while (contadorElentos != 0);
    }
}
