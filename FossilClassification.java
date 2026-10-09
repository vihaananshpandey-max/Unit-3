import java.util.Scanner;

public class FossilClassification {
    public static void main(String[] args) {
        // Write your code below!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fossil age(in mya):");
        int integer = scanner.nextInt();
        if (integer >= 66 && integer <= 144) {
            System.out.println("This is a fossil from the Cretacous period!");
        } else if (integer >= 145 && integer <= 201) {
            System.out.println("This is a fossil from the Jurassic period!");
        } else if (integer >= 202 && integer <= 252) {
            System.out.println("This is a fossil from the Triassic period!");
        } else {
            System.out.println("._.");
        }
    }
}
