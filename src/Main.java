import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // add remove and move functionality

        Scanner scanner = new Scanner(System.in);


        int first = 0;
        int second = 0;

       /* System.out.println("First: " + first + "/100\n" +
                "Second: " + second + "/100"); */


        while (true) {



            System.out.println("First: " + first + "/100\n" +
                    "Second: " + second + "/100");

            String input = scanner.nextLine();



            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);




            if (command.equals("add")) {
                if (amount > 0) {
                    first += amount;
                }
            }

            if (command.equals("move")) {
                if (amount > 0) {
                    second += amount;
                    first -= amount;
                }


            }

            if (command.equals("remove")) {
                if (amount > 0) {
                    second -= amount;
                }
            }

            if (first < 0) {
                first = 0;
            }

            if (second < 0) {
                second = 0;
            }

            if (first > 100) {
                first = 100;
            }

            if (second > 100) {
                second = 100;
            }

        }


    }
}