package Lista_Heranca.Exerci_3;

import java.util.ArrayList;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected double vida;

    public Personagem(String nome, int nivel, double vida){
        if(nome.trim().isEmpty() || nivel < 0 || vida == 0){
            System.out.println("Personagem com dados incompletos");
        }
        else{
            this.nome = nome;
            this.nivel = nivel;
            this.vida = vida;
        }
    }
    public void exibirFicha(){
        System.out.println("Ficha do Personagem");
        System.out.println("Nome: "+this.nome);
        System.out.println("Nível: "+this.nivel);
        System.out.println("Vida: "+this.vida);
    }

    public void receberDano(int danos) {
    }
}
