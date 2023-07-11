package Patterns;
import java.util.Scanner;

public class Pattern10 {

    public static void straight_right_triangle(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_right_triangle(int n){
        for(int i = 1; i<=n; i++ ){
            if(i == 1){
                continue;
            }
            for(int j = 0; j < n - i +1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        straight_right_triangle(n);
        inverted_right_triangle(n);

        sc.close();
    }
}
