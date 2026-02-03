package Lista_Heranca.Exerci_2;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca Lucas = new ContaPoupanca(20000.0, 0.5);
        Lucas.depositar(300);
        Lucas.aplicar();
        System.out.println("Saldo de R$"+ Lucas.getSaldo());

        System.out.println("COnta corrente");
        ContaCorrente LucasCorrente = new ContaCorrente(20000.0);
            LucasCorrente.sacar(100.0);
            LucasCorrente.sacar(50.0);
        System.out.println("Saldo R$ "+LucasCorrente.getSaldo());


    }
}
