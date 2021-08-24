import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int sumFirst = 0;
        int sumSecond = 0;

        for (int i = 0; i < 3; i++) {
            sumFirst += Character.getNumericValue(string.charAt(i));
        }

        for (int i = 3; i < 6; i++) {
            sumSecond += Character.getNumericValue(string.charAt(i));
        }

        System.out.println(sumFirst == sumSecond ? "Lucky" : "Regular");
    }
}