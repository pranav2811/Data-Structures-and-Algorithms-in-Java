package Divide_and_Conquer.MaxSubArrayProblem;

public class Main {
    public static void main(String[] args){
    MaxSubArray msa = new MaxSubArray();

    int arr[] = { 2, 3, 4, 5, 7 };
    int n = arr.length;
    int max_sum = msa.maxSubArraySum(arr, 0, n - 1);

    System.out.println("The maximum sum in the array is: "+ max_sum);
    }
       
}
