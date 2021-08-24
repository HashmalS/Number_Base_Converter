import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        int start = inputString.length() / 2;

        if (inputString.length() % 2 == 0) {
            inputString = new StringBuilder(inputString).delete(start - 1, start + 1).toString();
        } else {
            inputString = new StringBuilder(inputString).delete(start, start + 1).toString();
        }

        System.out.println(inputString);
    }
}