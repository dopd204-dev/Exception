public class BankCard {

    private String ownerName;
    private double balance = 5000.0;

    public BankCard(String ownerName) {
        this.ownerName = ownerName;
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть больше 0!");
        }

        if (amount > balance) {
            double shortage = amount - balance;
            throw new InsufficientFundsException(shortage);
        }

        balance -= amount;
        System.out.println("Снято: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}