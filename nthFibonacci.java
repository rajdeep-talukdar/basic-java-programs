import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the term you want: ");
        int nthTerm = in.nextInt();
        int first = 0;
        int second = 1;
        if (nthTerm < 0) {
            System.out.println("please enter a positive number");
        }
        else {
            switch (nthTerm) {
                case 0 -> System.out.print("no terms to display");
                case 1 -> System.out.print("the " + nthTerm + " term is: " + first);
                case 2 -> System.out.print("the " + nthTerm + " term is: " + second);
                default -> {
                    for (int i = 3; i <= nthTerm; i++) {
                        int next = first + second;
                        first = second;
                        second = next;
                    }
                    System.out.print("the " + nthTerm + " term is: " + second);
                }
            }
        }
        in.close();
    }
}
