
//calculate the power of a number using recursion
public interface power {

    static int power(int base, int exp){
        if  (exp < 0){
            return -1;
        }
        if(exp == 0){
            return 1;
        }
        else{
            return base * power(base, exp -1);
        }

    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
