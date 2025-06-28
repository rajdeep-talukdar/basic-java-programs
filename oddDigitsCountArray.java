import java.util.Scanner;

public class oddDigitsCountArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("length of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(countNumber(arr));
    }

    static int countNumber(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(countDigit(arr[i]) % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    static int countDigit(int num) {
        num = Math.abs(num);
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
