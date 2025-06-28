import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("length of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("target element: ");
        int target = in.nextInt();

        System.out.println("index: " + linearSearch(arr, target));

    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0 ) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
