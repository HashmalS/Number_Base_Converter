import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        String reverseString = new StringBuilder(inputString).reverse().toString();

        System.out.println(inputString.equals(reverseString) ? "yes" : "no");
    }
}