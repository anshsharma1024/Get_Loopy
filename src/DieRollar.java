import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        String again;

        do {
            // Header row
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollNumber = 0;
            boolean triple = false;

            // Keep throwing until all 3 dice match
            while (!triple) {
                rollNumber++;
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-6d%-6d%-6d%-6d%-6d%n", rollNumber, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    triple = true;
                }
            }

            System.out.println();
            System.out.print("Got a triple! Roll again? (y/n): ");
            again = input.nextLine();
            System.out.println();

        } while (again.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}