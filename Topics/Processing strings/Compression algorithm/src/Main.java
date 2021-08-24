import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();

        int charsInARow = 1;
        boolean sameAsPrevious = false;
        String newString = "";
        for (int i = 1; i < inputString.length(); i++) {
            sameAsPrevious = inputString.charAt(i) == inputString.charAt(i - 1);
            if (sameAsPrevious) {
                charsInARow++;
            } else {
                newString = newString.concat("" + inputString.charAt(i - 1) + charsInARow);
                charsInARow = 1;
            }
        }

        newString = newString.concat("" + inputString.charAt(inputString.length() - 1) + charsInARow);

        System.out.println(newString);
    }
}