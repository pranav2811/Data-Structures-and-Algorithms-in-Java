

public class S8_RadixSort {
    public static void main(String[] args) {

        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(radixArray, 10, 4);

        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }

    }

    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);// will move from the least significant to most significant digit that is
                                             // from righ to left
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length;
        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;// By the time this loop is finished well have a conventional
                                                           // count array
            // But we need to have a stable count array so we need to sum up all of the
            // counts upto and including the digit that we are working on
        }
        for (int j = 1; j < radix; j++) {// we dont have to change the first count
            countArray[j] += countArray[j - 1];// adjust the count array with sum of all previous indices to get stable
                                               // count array
        }
        // now we copy the values into a temporary array
        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        } // Now we need to copy them back into the original array

        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}