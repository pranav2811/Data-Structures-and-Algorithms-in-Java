package Patterns;
import java.util.Scanner;
public class Pattern9 {

    public static void straight_pyramid(int N){
        for (int i = 0; i < N; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*i+1;j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
         for (int j =0; j<N-i-1; j++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }

    }
    public static void inverted_pyramid(int n){
        for(int i = 0; i < n; i++){

            //to print out the spaces before the stars
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //to print out the stars
            for(int j = 0; j <2*n - (2*i +1) ; j++){
                System.out.print("*");
            }
            //to print out the spaces after the stars
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        straight_pyramid(n);
        inverted_pyramid(n);

        sc.close();
    }
    
}
