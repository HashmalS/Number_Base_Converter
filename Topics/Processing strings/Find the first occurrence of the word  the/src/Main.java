import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        int theOccurrence = -1;

        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length() - 2; i++) {
            if (inputString.substring(i).startsWith("the")) {
                theOccurrence = i;
                break;
            }
        }

        System.out.println(theOccurrence);
    }
}