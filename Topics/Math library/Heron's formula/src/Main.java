import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double perimeter = (a + b + c) / 2;

        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));

        System.out.println(area);
    }
}