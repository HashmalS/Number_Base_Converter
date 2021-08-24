import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();

        boolean isInOrder = true;

        for (int i = 1; i < inputString.length(); i++) {
            if (!(inputString.charAt(i) - inputString.charAt(i - 1) == 1)) {
                isInOrder = false;
                break;
            }
        }

        System.out.println(isInOrder);
    }
}