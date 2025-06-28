import java.util.Scanner;

public class fibonacciWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the no. of terms you want: ");
        int term = in.nextInt();
        int first = 0;
        int second = 1;
        switch (term) {
            case 0 -> {}
            case 1 -> System.out.print(first + " ");
            case 2 -> System.out.print(first + " " + second + " ");
            default -> {
                System.out.print(first + " " + second + " ");

                int i = 3;
                while (i <= term) {
                    int next = first + second;
                    first = second;
                    second = next;
                    i++;
                    System.out.print(next + " ");
                }

            }
        }

    }
}
