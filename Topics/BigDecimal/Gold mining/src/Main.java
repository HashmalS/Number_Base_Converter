import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        BigDecimal dwarfDwalin = scanner.nextBigDecimal();
        BigDecimal dwarfBalin = scanner.nextBigDecimal();
        BigDecimal dwarfThorin = scanner.nextBigDecimal();

        System.out.println(dwarfBalin.add(dwarfDwalin).add(dwarfThorin));
    }
}