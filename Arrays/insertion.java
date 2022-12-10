package Arrays;

import java.util.Scanner;
public class insertion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Enter the number you want to insert: ");
        int number = sc.nextInt();
        System.out.println("Enter the position you want to insert the number: ");
        int position = sc.nextInt();

        for(int i = intArray.length - 1; i > position; i--){
            intArray[i+1] = intArray[i];
        }
        intArray[position] = number;
        sc.close();
    }
}
