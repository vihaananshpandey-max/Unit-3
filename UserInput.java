import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        System.out.println("The word, " + string + "!, is fun to say");
        System.out.println("Enter an integer:");
        int integer = scanner.nextInt();
        System.out.println("Squared:" + integer * integer);
    }
}