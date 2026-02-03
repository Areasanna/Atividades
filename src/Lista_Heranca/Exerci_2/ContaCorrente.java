package Lista_Heranca.Exerci_2;

public class ContaCorrente extends ContaBancaria {
    private double taxa = 0.50;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }
    @Override
    public void sacar(double valor) {
        double valorTotal = valor + taxa;

        if (valorTotal <= saldo) {
            this.saldo -= valorTotal;
            System.out.println("Saque: R$ " + valor + " | Taxa: R$ 0,50 | Total: R$ " + valorTotal);
        } else {
            System.out.println("Saldo insuficiente para cobrir o saque e a taxa.");
        }
}
}