package Patterns;

public class Pattern18 {
    public static void main(String[] args){
        int ch =69;
        for(int i = 1; i <=5; i++){
            for(int j = 0; j < i; j++){
                System.out.print((char)(ch+j));
            }
            ch--;
            System.out.println();
        }
        
    }
}
