import java.util.Scanner;

public class inrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the amount in rupees you want to convert: ");
        int rupee = in.nextInt();
        double dollar = (rupee * 0.012);
        System.out.println("your rupees in dollars is: $" + dollar);
        in.close();
    }
}

