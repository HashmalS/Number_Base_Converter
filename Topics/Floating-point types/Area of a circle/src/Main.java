import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}