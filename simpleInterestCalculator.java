import java.util.Scanner;

public class simpleInterestCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the amount: ");
        int principal = in.nextInt();

        System.out.print("enter the interest rate: ");
        double rate = in.nextDouble();

        System.out.print("Is the time in years or months? Enter 'y' for years or 'm' for months: ");
        char timeChoice = in.next().charAt(0);
        timeChoice = Character.toLowerCase(timeChoice);
        double time = 0;
        String timeUnit = "";

        if (timeChoice == 'y') {
            System.out.print("enter time in years: ");
            time = in.nextDouble();
            timeUnit = "years";

        }
        else if (timeChoice == 'm') {
            System.out.print("enter time in months: ");
            int months = in.nextInt();
            time = months / 12.0;
            timeUnit = "months";
        }
        else {
            System.out.println("invalid choice");
            return;
        }

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("the simple interest for amount " + principal + " at " + rate + "%" + " for " + time + " " +  timeUnit + " is: " + simpleInterest);
        double totalAmount = (principal + simpleInterest);
        System.out.println("total amount after interest is: " + totalAmount);

        in.close();
    }
}
