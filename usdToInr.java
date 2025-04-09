import java.util.Scanner;

public class usdToInr {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the amount in dollars you want to convert: ");
        int dollar = in.nextInt();
        double rupee = (dollar * 85.87);
        System.out.println("your dollars in rupees is: ₹" + rupee);
        in.close();
    }
}
