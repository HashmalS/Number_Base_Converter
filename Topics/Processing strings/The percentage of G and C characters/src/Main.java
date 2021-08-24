import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        int numberOfGC = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.toLowerCase(inputString.charAt(i)) == 'c' ||
                    Character.toLowerCase(inputString.charAt(i)) == 'g') {
                numberOfGC++;
            }
        }

        System.out.println((double) numberOfGC / inputString.length() * 100);
    }
}