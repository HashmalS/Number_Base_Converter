import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String[] inputArray = inputString.split("\\s+");

        String longestWord = "";

        for (String string :
                inputArray) {
            if (string.length() > longestWord.length()) {
                longestWord = string;
            }
        }

        System.out.println(longestWord);
    }
}