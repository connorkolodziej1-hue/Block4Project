import java.util.Scanner;

public class housingAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;

        // Grades
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        if (gpa >= 4.0) {
            totalScore += 10;
        } else if (gpa >= 3.0) {
            totalScore += 7;
        } else if (gpa >= 2.0) {
            totalScore += 5;
        } else if (gpa >= 1.0) {
            totalScore += 2;
        } else {
            totalScore += 0;
        }

        // School Year
        System.out.print("Enter school year (1 = freshman/incoming, 2, 3, 4+): ");
        int year = scanner.nextInt();

        if (year >= 4) {
            totalScore += 1;
        } else if (year == 3) {
            totalScore += 2;
        } else if (year == 2) {
            totalScore += 4;
        } else if (year == 1) {
            totalScore += 6;
        }

        // Distance from Home
        System.out.println("Distance from Home:");
        System.out.println("1 = Local, 2 = In-state, 3 = Out-of-state, 4 = International");
        int distance = scanner.nextInt();

        switch (distance) {
            case 1:
                totalScore += 0;
                break;
            case 2:
                totalScore += 1;
                break;
            case 3:
                totalScore += 3;
                break;
            case 4:
                totalScore += 5;
                break;
        }

        // Financial Status
        System.out.println("Financial Status:");
        System.out.println("1 = Can afford");
        System.out.println("2 = Needs loan (good credit)");
        System.out.println("3 = Needs loan (okay credit)");
        System.out.println("4 = Needs loan (bad credit)");
        int financial = scanner.nextInt();

        switch (financial) {
            case 1:
                totalScore += 3;
                break;
            case 2:
                totalScore += 2;
                break;
            case 3:
                totalScore += 1;
                break;
            case 4:
                totalScore += 0;
                break;
        }

        // University Affiliation
        System.out.print("Faculty family member? (true/false): ");
        boolean faculty = scanner.nextBoolean();
        if (faculty) {
            totalScore += 1;
        }

        System.out.print("Alumni in family? (true/false): ");
        boolean alumni = scanner.nextBoolean();
        if (alumni) {
            totalScore += 1;
        }

        // Final Score
        System.out.println("Total Score: " + totalScore);

        scanner.close();
    }
}