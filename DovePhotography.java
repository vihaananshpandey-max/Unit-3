import java.util.Scanner;

public class DovePhotography {
    public static void main(String[] args) {
        // Write your code below!
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Essential Guide to Birdwatching!");
        System.out.println("Please enter bird family:");
        String family = scanner.nextLine();
        System.out.println("Please enter feather color:");
        String featherColor = scanner.nextLine();
        System.out.println("Please enter eye color:");
        String eyeColor = scanner.nextLine();

        if (family.equals("Columbidae")) {
            System.out.println("Dove! Take pictures!");
            if (featherColor.equals("Orange")) {
                System.out.println("Cooler dove!! Take many pictures!!");
                if (eyeColor.equals("Blue")) {
                    System.out.println("Jackpot!! Take as many pictures as possible!");
                }
            }
        } else {
            System.out.println("Meh bird.... let's find a different one.");

        }
    }
}
