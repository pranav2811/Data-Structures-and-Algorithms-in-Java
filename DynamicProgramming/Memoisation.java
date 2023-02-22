package DynamicProgramming;
import java.util.*;
//using top down memoisation approach - i.e we start by breaking the problem from the stop and keep storing the solutions of the 
//subproblems so that we dont have to calculate them again and again like divde and conquer


public class Memoisation{

    public static void main(String[] args){
        HashMap<Integer, Integer> memo = new HashMap<>();
        System.out.println(fibMemo(5, memo));
    }
    public static int fibMemo(int n, HashMap<Integer, Integer> memo){

        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        if(!memo.containsKey(n)){
            memo.put(n, (fibMemo(n -1, memo) + fibMemo(n-2, memo)));

        }

        return memo.get(n);

    }
}

 
