import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        BigDecimal input = scanner.nextBigDecimal();
        int newScale = scanner.nextInt();

        System.out.println(input.setScale(newScale, RoundingMode.HALF_DOWN));
    }   
}