
//Write a program to find the sum of digits of a positive integer number using recursion
public class sumOfDigits {

    static int sumOfDigits(int n){
        if(n == 0 || n < 0){
            return 0;
        }
        else{
            return n % 10 + sumOfDigits(n / 10); 
        }
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }
}
