import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {

        int[] randomNums = getRandomNums();

        int minNum = getMin(randomNums);

        int evenNums = getEvenNums(randomNums);

        List<Integer> evenNumsList = getEvenNumsList(randomNums);

        int oddNumSum = getOddNumSum(randomNums);

        System.out.println(randomNums);
        System.out.println(minNum);
        System.out.println(evenNums);
        System.out.println(evenNumsList);
        System.out.println(oddNumSum);
    }

    public static int[] getRandomNums(){
        int[] randomNums = new int[20];
      //  int low = 10;
      //  int high = 100;
        Random ran= new Random();
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = ran.nextInt(100);
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

    public static int getEvenNums(int[] nums) {
        int evenCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                evenCounter++;
            }
        }
        return evenCounter;
    }

    public static List<Integer> getEvenNumsList(int[] nums ) {
        List<Integer> evenCounter = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCounter.add(nums[i]);
            }
        }
        return evenCounter;
    }

    public static int getOddNumSum(int[] num) {
        int oddNumSum = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                oddNumSum += num[i];
            }
        }
        return  oddNumSum;
    }

}
