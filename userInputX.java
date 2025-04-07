import java.util.Scanner;

public class userInputX {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number or 'x' to exit: ");
            String input = in.next();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            else {
                int number = Integer.parseInt(input);
                sum += number;
            }
        }
        System.out.println("Final sum: " + sum);
        in.close();

    }
}
