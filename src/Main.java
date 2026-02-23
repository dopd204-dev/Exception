import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankCard card = new BankCard("Asan");

        int choice;

        do {
            System.out.println("\n1 — Снять деньги");
            System.out.println("2 — Посмотреть баланс");
            System.out.println("0 — Выход");
            System.out.print("Выберите действие: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Введите сумму: ");
                    double amount = scanner.nextDouble();

                    try {
                        card.withdraw(amount);
                    } catch (IllegalArgumentException | InsufficientFundsException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Баланс: " + card.getBalance());
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }

        } while (choice != 0);

    }
}