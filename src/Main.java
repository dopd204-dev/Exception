import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordValidator validator = new PasswordValidator();

        while (true) {
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();

            try {
                validator.validate(password);
                break;
            } catch (WeakPasswordException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}