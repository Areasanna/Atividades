package Lista_de_Classes.Exerc_3src;

public class Main {
    public static void main(String[] args) {
        BankAccount minhaConta = new BankAccount("12345-X");

        System.out.println("Numero da conta: " + minhaConta.getAccountNumber());
        System.out.println("Saldo inicial: R$" + minhaConta.getBalance());

        minhaConta.deposit(500.0);
        //minhaConta.deposit(-50.0);
       // minhaConta.withdraw(30);
        minhaConta.withdraw(600);
        System.out.println("Saldo final na conta: R$" + minhaConta.getBalance());
    }
}