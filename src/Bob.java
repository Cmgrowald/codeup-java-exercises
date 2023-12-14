import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String usersChoice;
        do {
            System.out.print("Say something to Bob: ");
            String input = scanner.nextLine();

            if (input.endsWith("?")) {
                System.out.println("Bob: 'Sure.'");
            } else if (input.endsWith("!")) {
                System.out.println("Bob: 'Whoa, chill out!'");
            } else if (input.trim().isEmpty()) {
                System.out.println("Bob: 'Fine, be that way!'");
            } else {
                System.out.println("Bob: 'Whatever.'");
            }




            System.out.print("Want to keep talking to Bob? (y/n): ");
            usersChoice = scanner.nextLine();
        } while (usersChoice.equalsIgnoreCase("y"));

        System.out.println("Bob: 'Ugh, finally you're leaving.'");
        scanner.close();

    }
}
