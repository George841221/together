import java.util.Random;

public class Main {
    
    public static void main(String[] args) {

        int[] randomNums = getRandomNums();

    }

    public static int[] getRandomNums(){
        int[] randomNums = new int[20];
        int low = 10;
        int high = 100;
        Random ran= new Random();
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = ran.nextInt(high-low) + low;
        }
        return randomNums;
    };

    public static int getMin(int[] nums){
        int min = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            if ( nums[i] < min ){
                min = nums[i];
            }
        }
        return min;
    }

    public static int getEvenNums(int[] nums ){
        int evenCounter = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 == 0){
                evenCounter++;
            }
        }
        return evenCounter;
    }


}
