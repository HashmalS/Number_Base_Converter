import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String vectorAString = scanner.nextLine();
        String[] vectorACoordinates = vectorAString.split("\\s+");
        int vx = Integer.parseInt(vectorACoordinates[0]);
        int vy = Integer.parseInt(vectorACoordinates[1]);
        String vectorBString = scanner.nextLine();
        String[] vectorBCoordinates = vectorBString.split("\\s+");
        int ux = Integer.parseInt(vectorBCoordinates[0]);
        int uy = Integer.parseInt(vectorBCoordinates[1]);

        int numerator = vx * ux + vy * uy;
        double denominator = Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2)) *
                Math.sqrt(Math.pow(ux, 2) + Math.pow(uy, 2));
        double cos = numerator / denominator;

        System.out.println(Math.toDegrees(Math.acos(cos)));
    }
}