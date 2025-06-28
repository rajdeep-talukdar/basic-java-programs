public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 9, 11, 12, 17, 19, 22, 25, 27, 29};
        int target = 29;
        System.out.println(binarysearch(arr, target));
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid  + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}