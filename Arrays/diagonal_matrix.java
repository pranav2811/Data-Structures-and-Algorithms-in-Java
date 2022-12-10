
package Arrays;
public class diagonal_matrix{
    public static void main(String[] args){
        int a[] = {1,2,3,4};

        for(int i = 0; i < a.length; i ++){
            for(int j = 0; j < a.length; j++){
                if(i == j){
                    System.out.print(a[i]);
                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
    }
}