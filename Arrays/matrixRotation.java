package Arrays;
//first we transpose the matrix and then reverse every row of the matrix
//since we wont be creating any new matrix space complexity will be o(n1) and time complexity will be o(n^2)
public class matrixRotation {
    public void rotate(int[][] matrix) {
        //first we transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //now we reverse every row of the matrix using two pointer method
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        matrixRotation obj = new matrixRotation();

        obj.rotate(matrix);

    }

}
