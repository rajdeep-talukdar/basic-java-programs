import java.util.Scanner;

public class searchInRange {
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

        System.out.print("start index: ");
        int start = in.nextInt();
        System.out.print("end index: ");
        int end = in.nextInt();

        System.out.println("index: " + linearSearch(arr, target, start, end));

    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0 ) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
