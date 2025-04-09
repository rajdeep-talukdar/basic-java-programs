import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter how many terms you want: ");
        int num = in.nextInt();
        int first = 0;
        int second = 1;

        if (num == 1) {
            System.out.print(first);
        }
        else if (num >=2 ) {
            System.out.print(first + " " + second);
            for (int i = 2; i < num; i++) {
                int next = first + second;
                System.out.print(" " + next);
                first = second;
                second = next;
            }
        }
        else {
            System.out.print("enter a valid number");
        }
        in.close();
    }
}