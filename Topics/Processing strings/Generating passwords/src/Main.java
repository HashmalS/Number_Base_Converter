import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();

        String[] strings = inputString.split("\\s");
        int uppercaseSymbols = Integer.parseInt(strings[0]);
        int lowercaseSymbols = Integer.parseInt(strings[1]);
        int digits = Integer.parseInt(strings[2]);
        int totalSymbols = Integer.parseInt(strings[3]);

        char[] password = new char[totalSymbols];
        int index = 0;
        char value;
        char previousValue = '.';

        for (int i = 0; i < uppercaseSymbols; i++) {
            do {
                value = (char) (Math.random() * (90 - 65) + 65);
            } while (value == previousValue);
            previousValue = value;
            password[index++] = value;
        }
        for (int i = 0; i < lowercaseSymbols; i++) {
            do {
                value = (char) (Math.random() * (122 - 97) + 97);
            } while (value == previousValue);
            previousValue = value;
            password[index++] = value;
        }
        for (int i = 0; i < digits; i++) {
            do {
                value = (char) (Math.random() * (57 - 48) + 48);
            } while (value == previousValue);
            previousValue = value;
            password[index++] = value;
        }
        for (int i = uppercaseSymbols + lowercaseSymbols + digits; i < totalSymbols; i++) {
            do {
                value = (char) (Math.random() * (126 - 33) + 33);
            } while (value == previousValue);
            previousValue = value;
            password[index++] = value;
        }

        System.out.println(password);
    }
}