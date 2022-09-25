import java.util.Scanner;
public class tridigonal_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int i,j,k=0;
        int size = 3*n-2;
        int arr[] = new int[size];
        for(i = 0; i < size; i ++){
            arr[i] = sc.nextInt();
        }
        for(i = 0; i <n; i ++){
            for(j = 0; j < n; j ++){
                if(i - j == -1 || i - j == 1 || i - j == 0){
                    System.out.print(arr[k]);
                    k++;
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();

        }
    }
}
