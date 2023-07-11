package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){

        //to print out the spaces before the stars
        for(int j = 0; j <n - i +1; j++){
            System.out.print(" ");
        }
        //to print out the stars
        for(int j = 0; j < 2*i+1; j++){
            System.out.print("*");
        }
        //to print out the spaces after the stars
        for(int j = 0; j > n - i + 1; j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    sc.close();
    }
    
}
