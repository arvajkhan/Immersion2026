import java.util.Scanner;

class Game {
    int[][] cards = {
            {1, 3, 5, 7, 9, 11, 13, 15, 17, 19},
            {2, 3, 6, 7, 10, 11, 14, 15, 18, 19},
            {4, 5, 6, 7, 12, 13, 14, 15, 20},
            {8, 9, 10, 11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
    };

    Scanner sc = new Scanner(System.in);

    void showMenu() {
        System.out.println("\n1. View Rules");
        System.out.println("2. Display Cards");
        System.out.println("3. Play Game");
        System.out.println("4. Exit");
        System.out.print("Enter Choice: ");
    }

    void displayRules() {
        System.out.println("Think of a number between 1 and 20.");
        System.out.println("Answer Y or N for each card.");
        System.out.println("The program will guess your number.");
    }

    void displayCards() {
        for (int i = 0; i < cards.length; i++) {
            System.out.println("\nCard " + (i + 1));
            for (int num : cards[i]) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    void playGame() {
        int result = 0;

        System.out.println("Think of a number between 1 and 20.");

        for (int i = 0; i < cards.length; i++) {
            System.out.println("\nCard " + (i + 1));
            for (int num : cards[i]) {
                System.out.print(num + " ");
            }

            System.out.print("\nIs your number present in Card " + (i + 1) + "? (Y/N): ");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("Yes")) {
                result += (1 << i);
            }
        }

        System.out.println("Your Secret Number is: " + result);
    }
}

public class SecretNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        int choice;

        do {
            game.showMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    game.displayRules();
                    break;
                case 2:
                    game.displayCards();
                    break;
                case 3:
                    game.playGame();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}