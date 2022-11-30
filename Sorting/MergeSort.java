package Sorting;


public class MergeSort{
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void mergeSort(int[] input, int start, int end){
        //we need a breaking condition for recursion
        if(end - start < 2){//a one element array is already sorted
            return;
        }
        //first we partition the array that has been passed

        int mid = (start + end) / 2;
        //now we do a merge sort on the left partition
        mergeSort(input, start, mid);//in this implementation the end index is always 1 greater than the last valid index
        //any extra elements are thrown into the right partition
        //the left partition is now sorted
        mergeSort(input, mid, end);//now the right partition is sorted
        merge(input, start, mid, end);//now we merge the left and right partition

    }

    public static void merge(int[] input, int start, int mid, int end){

        if(input[mid - 1] <= input[mid]){//this means that all the elements in the left partition <= elements in right partition i.e they are sorted
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        //now we have to handle the leftover elements that have not been copied into temp
        //we only need to handle the leftovers in the left array
        //we know the positions we need to copy them to so we do not need to copy them to the temp as theyll jump over the elements we have copied so far
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }
}