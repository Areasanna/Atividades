package Lista_01.src;

public class exerc4 {
    public static void main(String[]args){

        char letraMinuscula = 'j';
        System.out.println("Letra no formato original: " + letraMinuscula);

        char letraMaiscula = Character.toUpperCase(letraMinuscula);
        System.out.println("Letra em Maiúscula: " + letraMaiscula);

        boolean ehVogal = (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u');
        System.out.println("A letra " + letraMaiscula + " é uma vogal: "+ehVogal);
    }
}
