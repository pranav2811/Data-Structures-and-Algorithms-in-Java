package Arrays;

public class matrixMultiplication {
    public static void main(String[] args){
        int m1[][] = {{1,2,3},{4,5,6}};
        int m2[][] = {{7,8},{9,10},{11,12}};

        int r[][] = new int[2][2];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 3; k++){
                    r[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
