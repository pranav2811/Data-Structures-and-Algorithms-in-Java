public class gcd{
    static int gcd(int a, int b){
        //well be using euclidean algo 
        //base condition gcd(a,0) = a
        if(a < 0 || b < 0){
            return -1;
        }
        if ( b == 0){
            return a;
        }
        return gcd( b , a % b);

    }
    public static void main(String[] args){
         System.out.println(gcd(8, 4));
    }
}