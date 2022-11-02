import java.util.Scanner;
public class triangular_matrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int i,j,k=0;
        int size = n*(n+1)/2;
        int arr[] = new int[size];
        for(i = 0; i < size; i ++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The upper triangular matrix is ->");
        for(i = 0; i <n; i ++){
            for(j = 0; j < n; j ++){
                if(i<=j){
                    System.out.print(arr[k]);
                    k++;
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();

        }
        System.out.println("The lower triangular matrix is ->");
        for(i = 0; i <n; i ++){
            for(j = 0; j < n; j ++){
                if(i>=j){
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
