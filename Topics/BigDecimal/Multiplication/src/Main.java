import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        BigDecimal number1 = scanner.nextBigDecimal();
        BigDecimal number2 = scanner.nextBigDecimal();

        System.out.println(number1.multiply(number2));
    }
}