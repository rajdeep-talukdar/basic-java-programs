import java.util.Scanner;

public class lcmHcf {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter the first no: ");
        int num1 = in.nextInt();
        System.out.print("enter the second no: ");
        int num2 = in.nextInt();

        int temp;
        int originalNum1 = num1;
        int originalNum2 = num2;

        while (num1 !=0) {
            temp = num1;
            num1 = num2 % num1;
            num2 = temp;
        }
        int hcf = num2;
        System.out.println("hcf is: " + hcf);

        int lcm;

        lcm = (originalNum1 * originalNum2) / hcf;
        System.out.println("lcm is: " + lcm);

    }
}
