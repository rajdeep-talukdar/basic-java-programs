import java.util.Scanner;

public class maxElementInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("max element : " + max);
    }
}
