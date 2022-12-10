package Arrays;
import java.util.Scanner;

public class deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Enter the position you want to delete: ");
        int position = sc.nextInt();
        for(int i = position; i < intArray.length - 2; i++){
            intArray[i] = intArray[i+1];
        }

        sc.close();
    }
}
