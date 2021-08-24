import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean c1 = a + b > c;
        boolean c2 = a + c > b;
        boolean c3 = b + c > a;

        System.out.println(c1 && c2 && c3 ? "YES" : "NO");
    }
}