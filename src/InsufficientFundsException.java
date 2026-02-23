public class InsufficientFundsException extends RuntimeException {

    private double shortage;

    public InsufficientFundsException(double shortage) {
        super("Недостаточно средств! Не хватает: " + shortage);
        this.shortage = shortage;
    }

    public double getShortage() {
        return shortage;
    }
}