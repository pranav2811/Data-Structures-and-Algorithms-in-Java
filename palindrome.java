import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reverseString = "";

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverseNum = 0;
        int temp = num;

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString + str.charAt(i);

        }
        

        while(temp != 0){
            int lastDigit = temp % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            temp /= 10;
        }
        if (str.toLowerCase().equals(reverseString.toLowerCase())) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
        if (reverseNum == num){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }

        sc.close();
    }

}
