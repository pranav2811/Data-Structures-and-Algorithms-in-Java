package Arrays;
public class searchMin{
    public static void main(String[] args){

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int min = 0;
        for(int i = 0; i < intArray.length; i++){
            if(intArray[i] < intArray[min]){
                min = i;
            }
        }
        System.out.println("The minimum value is " + intArray[min]);

    }
}