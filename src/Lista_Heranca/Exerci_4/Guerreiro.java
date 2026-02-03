package Lista_Heranca.Exerci_4;

public class Guerreiro extends Personagem {
    private int forcaFisica;

    public Guerreiro(String nome, int nivel, double vida, int forcaFisica) {
        super(nome, nivel, vida + 50);
        this.forcaFisica = forcaFisica;
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Força Física: " + this.forcaFisica);
    }

    @Override
    public void receberDano(int pontos) {
        int danoFinal = Math.max(0, pontos - 5);
        super.receberDano(danoFinal);

        if (danoFinal == 0) {
            System.out.println("Armadura bloqueou o impacto");
        }

    }
}