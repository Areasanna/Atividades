package Lista_02.src;

import java.util.HashMap;
import java.util.Map;

public class Contagem_Frequencia {
    public static void main(String[] args) {
        String frase = "Lucas comprou um telefone usado.";
        String[] palavras = frase.toLowerCase()
                .replaceAll("[^a-zA-Zá-úÁ-Ú\\s]", "")
                .split("\\s+");


        Map<String,Integer> contagemMapa = new HashMap<>();
        for(String palavra : palavras){
            if(!palavra.isEmpty()){
                int contagemAtual = contagemMapa.getOrDefault(palavra, 0);
                contagemMapa.put(palavra, contagemAtual+1);
            }
        }
            System.out.println("Resultado: ");
            for(String chave : contagemMapa.keySet()){
                System.out.println(chave+": "+contagemMapa.get(chave));
        }
    }
}
