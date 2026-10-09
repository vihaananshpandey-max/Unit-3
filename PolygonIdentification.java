import java.util.Scanner;

public class PolygonIdentification {
    public static void main(String[] args) {
        // Write your code below!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I am Program, tell me how many sides your polygon has:");
        int sides = scanner.nextInt();
        switch (sides) {
            case 3:
                System.out.println("I, Program, know this is a triangle");
                break;
            case 4:
                System.out.println("I, Program, know this is a quadrilateral");
                break;
            case 5:
                System.out.println("I, Program, know this is a pentagon");
                break;
            case 6:
                System.out.println("I, Program, know this is a hexagon");
                break;
            default:
                System.out.println("I, Program, think you should figure it out yourself >:(");
        }
    }
}
