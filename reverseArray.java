import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        reverse(arr);
        System.out.println("reversed array: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

//        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
//            int temp= arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//        }

    }
}
