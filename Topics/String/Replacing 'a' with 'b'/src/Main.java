import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner inputScanner = new Scanner(System.in);

        String inputString = inputScanner.nextLine();

        String newString = "";

        char character;

        for (int i = 0; i < inputString.length(); i++) {
            character = inputString.charAt(i);
            if (character == 'a') {
                newString = newString.concat("b");
            } else {
                newString = newString.concat(Character.toString(character));
            }
        }

        System.out.println(newString);
    }
}
