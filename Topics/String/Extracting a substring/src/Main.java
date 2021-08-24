import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(inputString.substring(a, b + 1));
    }
}