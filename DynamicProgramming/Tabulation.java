package DynamicProgramming;
import java.util.*;
//solving fibonacci using tabulation problem that is starting from the smallest subproblem
//going up to the main problem and not using recursion
public class Tabulation {

    public static void main(String[] args){
        System.out.println(fibTab(6));
    }
    public static int fibTab(int n){
        ArrayList<Integer> tb = new ArrayList<>();
        tb.add(0);
        tb.add(1);
        for(int i = 2; i <= n-1 ;i++){
            int n1 = tb.get(i - 1);
            int n2 = tb.get(i - 2);
            tb.add(n1 + n2);
        }

        return tb.get(n-1);

    }
    
}
