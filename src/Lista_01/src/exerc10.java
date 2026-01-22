package Lista_01.src;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class exerc10 {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
       final String usuario_De_Acesso= "Anna_areas";
       final String senha_De_Acesso = "@Jesusamoe1";

       leitor.nextLine();

        System.out.print("digite o usuario: ");
        String usuarioDeAcesso= leitor.nextLine();
        System.out.println("Digite sua senha: ");
        String senhaDeAcesso = leitor.nextLine();

        if(senhaDeAcesso.equals(usuario_De_Acesso) && usuarioDeAcesso.equals(senha_De_Acesso)){
            System.out.println("Login bem-sucedido");
        } else{
            System.out.println("Credencias inválidas");
        }


    }
}
