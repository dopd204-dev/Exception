public class SquareCheck {
    public static void checkIfSquare(int number) {
        if (number < 0) {
            throw new RuntimeException("Терс сан квадрат боло албайт!");
        }

        int a = (int) Math.sqrt(number);

        if (a * a != number) {
            throw new RuntimeException("Бул сан квадрат эмес!");
        }

        System.out.println("Бул сан квадрат: " + a + "2");
    }
    public static void main(String[] args) {
        checkIfSquare(10);
    }
}
