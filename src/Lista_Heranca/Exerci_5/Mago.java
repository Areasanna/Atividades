package Lista_Heranca.Exerci_5;

public class Mago extends Personagem {
    private int mana;
    private int inteligencia;


    public Mago(String nome, int nivel, double vida, int mana) {
        super(nome, nivel, vida);
        this.inteligencia = nivel * 10;

        if (mana < 10) {
            System.out.println("O valor minimo tem que ser 10, informe outro");
            this.mana = 10;
        } else {
            this.mana = mana;
        }
    }
    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Mana: " + this.mana);
        System.out.println("Inteligencia: " + this.inteligencia);
    }
    @Override
    public void receberDano(int pontos){
        if(this.mana >10){
            int danoReduzido = pontos / 2;
            this.mana -= 5;
            System.out.println("Mana atual "+this.mana);
            super.receberDano(danoReduzido);
        }else{
            System.out.println("O escudo falhou");
            super.receberDano(pontos);
        }
    }

    @Override
    public void usarHabilidade() {
        System.out.println(this.nome + " lançando Bola de fogo!");
    }
}
