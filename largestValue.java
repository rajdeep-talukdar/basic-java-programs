import java.util.Scanner;

public class largestValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int max = Math.max(c,d);
        int max2 = (Math.max(a, b));
        int biggest = Math.max(max, max2);

        System.out.print(biggest + " is the largest");

    }
}
