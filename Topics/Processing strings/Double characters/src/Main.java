import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            newString.append(inputString.charAt(i)).append(inputString.charAt(i));
        }

        System.out.println(newString);
    }
}