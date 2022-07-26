

public class S6_QuickSort {
    public static void main(String[] args){
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        quickSort(intArray, 0, intArray.length);



        for(int i = 0; i <intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }

    public static void quickSort(int[] input, int start, int end){
        if(end - start < 2){//1 element array
            return;
        }
        //figure out what the index of the pivot is
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);//quickSort the left subarray
        quickSort(input, pivotIndex + 1, end);//quickSort of the right subArray

    }

    public static int  partition(int[] input, int start, int end){
        //this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        //we stop when i and j cross each other
        while (i < j){
            //we first use j to look for elements less than the pivot
            while(i < j && input[--j] >= pivot);//empty loop body just using it to find element less than pivot or j crosses i
            if(i < j){
                input[i] = input[j];
            }//now we look for the first element greater than the pivot

            while(i < j && input[++i] <= pivot);//empty loop body 
            //no we move the greater element to the right of the pivot
            if(i <j){
                input[j] = input[i];//at this point j is the index where we want to insert the pivot
            }
        }

        input[j] = pivot;
        return j; 
    }
}
