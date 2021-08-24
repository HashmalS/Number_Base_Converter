import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        BigDecimal startingAmount = scanner.nextBigDecimal();
        int yearlyPercent = scanner.nextInt();
        int years = scanner.nextInt();

        BigDecimal finalAmount = BigDecimal.valueOf(1 + (double) yearlyPercent / 100).pow(years);
        finalAmount = finalAmount.multiply(startingAmount).setScale(2, RoundingMode.CEILING);

        System.out.println("Amount of money in the account: " + finalAmount);
    }
}