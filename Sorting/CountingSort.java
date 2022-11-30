package Sorting;


public class CountingSort {
    public static void main(String[] args){
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        for (int i = 0; i < intArray.length; i ++){
            System.out.println(intArray[i]);
        }
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max - min) + 1];//the array thats going to keep track of the count
        //now we want to traverse out input array and count how many of each value do we have

        for(int i = 0; i < input.length; i++){
            countArray[input[i] - min]++;//the index of where to count each value i.e translating the value we want to count into its index
        }

        //after finishing counting we want to write the values back into the input array

        int j = 0; //index used to write to the input array
        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;//Once we count the element once we want to decrement its occurence as we have already counted it once
            }
        }
    }
}
