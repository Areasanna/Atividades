package Lista_de_Classes.Exerc_3src;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        if(amount < 0){
          System.out.println("Não pode ser negativo.");
      }else{
          this.balance += amount;
          System.out.println("Novo salto: "+this.balance);
      }
    }
    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Valor de saque inválido");
            return false;
        }
            if (balance >= amount) {
             this.balance -= amount;
             System.out.println("Saque realizado.");
             System.out.println("Novo salto: R$" + this.balance);
            return true;
        } else {
            System.out.println("Salto insuficiente");
            return false;
        }
    }
        public String getAccountNumber(){
         return this.accountNumber;
    }
    public Double getBalance(){
        return this.balance;
    }
}
