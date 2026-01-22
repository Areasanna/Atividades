package Lista_02.src;

public class Simulacao_Processamento {
    public static void main(String[] args) {

      String[] lonPedidos = {
              "Pedido 32428 feito por Anna Jullia Arêas com status ENTREGUE.",
              "Pedido 12324 feito por Julina Costa da Silva com status de PROCESSANDO.",
              "Pedido 56475 feito por Pedro Lucas com status de ENTREGUE.",
              "Pedido 34352 feito por Rafael Carlos da Silva com status de PROCESSANDO"
      };
      for(int i =0; i < lonPedidos.length; i++){
         String linhaAtual = lonPedidos[i];
          if(lonPedidos[i].contains("PROCESSANDO")){
              System.out.println(lonPedidos[i]);
          }
        }
    }
}
