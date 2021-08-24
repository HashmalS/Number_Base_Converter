import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner inputScanner = new Scanner(System.in);
        String inputString = inputScanner.nextLine();
        String substring = inputScanner.nextLine();

        int count = 0;
        boolean condition = false;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == substring.charAt(0) && substring.length() == 1) {
                count++;
            } else if (inputString.charAt(i) == substring.charAt(0) && i + substring.length() <= inputString.length()) {
                for (int j = 1; j < substring.length(); j++) {
                    if (substring.charAt(j) == inputString.charAt(i + j)) {
                        condition = true;
                    } else {
                        condition = false;
                        break;
                    }
                }
                if (condition) {
                    count++;
                    i += substring.length() - 1;
                    condition = false;
                }
            }
        }

        System.out.println(count);
    }
}