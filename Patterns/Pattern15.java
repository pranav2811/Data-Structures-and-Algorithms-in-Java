package Patterns;
import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ch = 65;

        for(int i = 1; i <=n; i++){
            for(int j = 0; j < n - i + 1; j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
        
        sc.close();
    }
}
