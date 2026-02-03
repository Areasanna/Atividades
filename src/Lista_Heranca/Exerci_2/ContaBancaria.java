package Lista_Heranca.Exerci_2;

public class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial){
      this.saldo = saldoInicial;
    }
    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            System.out.println("Valor R$ "+valor +"depositado");
        }
    }
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            System.out.println("Novo saldo R$ "+valor);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public double getSaldo(){
        return saldo;
    }

}
