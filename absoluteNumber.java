import java.util.Scanner;

public class absoluteNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();
        if (num < 0) {
            int absolute = num * -1;
            System.out.println(absolute);
        }
        else {
            System.out.println(num);
        }
        in.close();
    }
}
