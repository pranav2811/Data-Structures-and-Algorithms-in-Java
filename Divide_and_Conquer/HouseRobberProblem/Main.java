package Divide_and_Conquer.HouseRobberProblem;

public class Main {
    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] HouseNetWorth = {6,7,1,30,8,2,4};
        System.out.println(hr.maxMoney(HouseNetWorth));
    }
}
