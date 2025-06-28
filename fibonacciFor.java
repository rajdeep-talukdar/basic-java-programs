import java.util.Scanner;

public class fibonacciFor {
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
                for (int i = 3; i <= term; i++) {
                    int next = first + second;
                    first = second;
                    second = next;
                    System.out.print(next + " ");
                }
            }
        }

    }
}
