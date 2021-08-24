import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner inputScanner = new Scanner(System.in);
        String input1 = inputScanner.nextLine();
        String input2 = inputScanner.nextLine();

        input1 = input1.replaceAll("\\s+", "");
        input2 = input2.replaceAll("\\s+", "");
        System.out.println(input1.equals(input2));
    }
}