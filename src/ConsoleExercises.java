import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);

        // Scanner P1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Int: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        // scanner P2
        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);
        System.out.println("Third word: " + word3);

        scanner.nextLine(); // takes in last input and starts next line

        // Scanner P3
        System.out.print("Give me a sentence: ");
        String usersSentence = scanner.nextLine();
        System.out.println("This is your sentence: --> " + usersSentence);

        // Calculate room
        System.out.print("Give me the length and width of a room: ");
        String length = scanner.nextLine();
        String width = scanner.nextLine();
        int parsedLength = Integer.parseInt(length);
        int parsedWidth = Integer.parseInt(width);
        System.out.println("Area of the room: " + (parsedWidth * parsedLength));
        System.out.println("Perimeter of the room: " + (parsedLength * 2 + parsedWidth * 2));

    }
}
