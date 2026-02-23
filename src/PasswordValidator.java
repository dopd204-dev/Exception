public class PasswordValidator {

    public void validate(String password) throws WeakPasswordException {

        if (password.length() < 8) {
            throw new WeakPasswordException("Слишком короткий!");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new WeakPasswordException("Нужна заглавная буква!");
        }

        if (!password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Нужна цифра!");
        }

        if (!password.matches(".*[!@#$%].*")) {
            throw new WeakPasswordException("Нужен спецсимвол!");
        }

        System.out.println("Пароль надёжный!");
    }
}