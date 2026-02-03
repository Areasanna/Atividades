package Lista_Heranca.Exerci_2;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRedimento;

    public ContaPoupanca(double saldoInicial, double taxaRedimento) {
        super(saldoInicial);
        this.taxaRedimento = taxaRedimento;
    }
    public void aplicar(){
        double rendimento = this.saldo*(taxaRedimento/100);
        this.saldo += rendimento;
        System.out.println("Rendimento de "+ rendimento);

    }

}
