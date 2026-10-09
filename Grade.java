import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("So, you want to calculate what grade you need on your final.");
        System.out.println("As long as you aren't doing this instead of studying I can help you!");
        System.out.println("Studied or not studied:");
        // Did for fun. unnecessary
        String studied = scanner.nextLine();
        if (studied.equals("studied")) {
            System.out.println("Excellent! Let's calculate!");
            System.out.println("Enter your current grade:");
            double grade = scanner.nextDouble();
            System.out.println("Enter the weight of the final:");
            double weight = scanner.nextDouble();
            System.out.println("Enter what letter grade you want(A/B/C/D):");
            String empty = scanner.nextLine();
            String letterGrade = scanner.nextLine();
            switch (letterGrade) {
                case "A":
                    double targetGradeA = 90.0;
                    double minimumA = grade + 100 * (targetGradeA - grade) / weight;
                    System.out.println("You need at least a " + minimumA);
                    break;
                case "B":
                    double targetGradeB = 80.0;
                    double minimumB = grade + 100 * (targetGradeB - grade) / weight;
                    System.out.println("You need at least a " + minimumB);
                    break;
                case "C":
                    double targetGradeC = 70.0;
                    double minimumC = grade + 100 * (targetGradeC - grade) / weight;
                    System.out.println("You need at least a " + minimumC);
                    break;
                case "D":
                    double targetGradeD = 60.0;
                    double minimumD = grade + 100 * (targetGradeD - grade) / weight;
                    System.out.println("You need at least a " + minimumD);
                    break;
                default:
                    System.out.println("How dare you enter an invalid letter grade?");
            }

        } else {
            System.out.println(
                    "Calculator privileges restricted to studied students. How about a True or False (t/f) quiz?");
            System.out.println("This project will pass?");
            String answer = scanner.nextLine();
            if (answer.equals("t")) {
                System.out.println("Confidence always works, even for the unstudied.");
            } else {
                System.out.println("If this project fails, then you fail the quiz.");
            }
            System.out.println("Does pineapple belong on pizza?");
            String pineapple = scanner.nextLine();
            if (pineapple.equals("t")) {
                System.out.println("Your passing this quiz means you can use the calculator.");
            } else {
                System.out.println("Game Over");
            }
        }

    }
}
