import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        inputString = inputString.toLowerCase();

        int necessaryInsertions = 0;

        for (int i = 0; i < inputString.length() - 2; i++) {
            if (isVowel(inputString.charAt(i)) && isVowel(inputString.charAt(i + 1)) &&
                isVowel(inputString.charAt(i + 2))) {
                necessaryInsertions++;
                inputString = new StringBuilder(inputString).insert(i + 2, 'b').toString();
            } else if (!isVowel(inputString.charAt(i)) && !isVowel(inputString.charAt(i + 1)) &&
                    !isVowel(inputString.charAt(i + 2))) {
                necessaryInsertions++;
                inputString = new StringBuilder(inputString).insert(i + 2, 'a').toString();
            }
        }

        System.out.println(necessaryInsertions);
    }

    public static boolean isVowel(char c) {
        String vowels = "aeiouy";
        return vowels.contains("" + c);
    }
}