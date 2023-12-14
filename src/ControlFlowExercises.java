import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


        // PROBLEM 1.A
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // PROBLEM 1.B
      /*  int i = 100;

        do {
            System.out.println(i);
            i--;
            i--;
            i--;
            i--;
            i--;
        } while ( i >= -10);*/
//         long i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//
//        } while (i < 1000000);



        // PROBLEM 1.C

//        for (int i = 5;i < 16;i += 1 ) {
//            System.out.println(i);
//        }
//
//        for (long i = 2;i < 1000001;i *= i ) {
//            System.out.println(i);
//        }


//        FIZZBUZZ

//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);
//        String usersChoice;
//        do {
//            System.out.print("Enter an integer: ");
//            int num = scanner.nextInt();
//
//            System.out.println("Number | Square | Cube");
//            System.out.println("---------------");
//
//            for (int i = 1; i <= num; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//                System.out.printf("%-7d| %-7d| %-7d%n", i, square, cube);
//            }
//
//            System.out.print("Do you want to continue? (yes/no): ");
//            usersChoice = scanner.next();
//        } while (usersChoice.equalsIgnoreCase("yes"));
//
//        System.out.println("Thank you for using the program!");
//        scanner.close();
//    }
    String usersChoice;
        do {
            System.out.print("Enter your grade 0-100: ");
            int num = scanner.nextInt();

            if (num >= 88) {
                System.out.println("A");
            } else if (num >= 80) {
                System.out.println("B");
            } else if ( num >= 67){
                System.out.println("C");
            } else if (num >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }




            System.out.print("Do you want to continue? (y/n): ");
            usersChoice = scanner.next();
        } while (usersChoice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the program!");
        scanner.close();
    }



}
