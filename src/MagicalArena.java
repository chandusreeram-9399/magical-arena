import java.util.Scanner;

public class MagicalArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for Player A
        System.out.println("Enter details for Player A:");
        System.out.print("Name: ");
        String nameA = scanner.nextLine();
        System.out.print("Health: ");
        int healthA = scanner.nextInt();
        System.out.print("Strength: ");
        int strengthA = scanner.nextInt();
        System.out.print("Attack: ");
        int attackA = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input details for Player B
        System.out.println("\nEnter details for Player B:");
        System.out.print("Name: ");
        String nameB = scanner.nextLine();
        System.out.print("Health: ");
        int healthB = scanner.nextInt();
        System.out.print("Strength: ");
        int strengthB = scanner.nextInt();
        System.out.print("Attack: ");
        int attackB = scanner.nextInt();

        // Create Players and Match
        Player playerA = new Player(nameA, healthA, strengthA, attackA);
        Player playerB = new Player(nameB, healthB, strengthB, attackB);

        Match match = new Match(playerA, playerB);
        match.start();

        scanner.close();
    }
}
