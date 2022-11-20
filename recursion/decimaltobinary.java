
public class decimaltobinary{

        public static int decimaltobinary(int n){
            if(n == 0){
                return 0;
            }
            return n % 2 + decimaltobinary(n/2) * 10;
        }
    public static void main(String[] args){

        var result = decimaltobinary(13);
        System.out.println(result);

    }
    
}