package Arrays;
public class Searching {

    // Linear Search
    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }

        }
        System.out.println("The element is not present in the array");
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;

        int middle = (start + end) / 2;

        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle - 1;
            }

            else {
                start = middle + 1;
            }
            middle = (start + end) / 2;

            if (arr[middle] == value) {
                System.out.println("The element found at the index " + middle);
                return middle;
            } else {
                System.out.println("The element is not present in the array");
                return -1;
            }
        }
        return middle;

    }

    public static void main(String[] args) {
        int[] arr = { 8, 15, 23, 27, 37 };
        System.out.println(binarySearch(arr, 23));
    }
}