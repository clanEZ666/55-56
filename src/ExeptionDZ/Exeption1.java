package ExeptionDZ;

public class Exeption1 {
    public static void main(String[] args) {
        double result = divide(10, 0);
        System.out.println("Результат: " + result);
    }

    public static double divide(int numerator, int denominator) {
        try {
            return numerator / (double) denominator;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
            return 0;
        }
    }
}
