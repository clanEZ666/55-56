package ExeptionDZ;

public class Exeption2 {
    public static void main(String[] args) {
        try {
            double result = divide(10, 0);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        }
    }

    public static double divide(int numerator, int denominator) {
        return numerator / (double) denominator;
    }

}
