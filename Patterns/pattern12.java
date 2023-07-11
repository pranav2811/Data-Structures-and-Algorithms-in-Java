package Patterns;

import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int spaces = 2*(n-1);

        for(int i = 1; i <= n; i++){
            //for printing the first set of numbers
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            //for printing the spaces
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            //for printing the second set of numbers
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            spaces -=2;
        }
    }
}
