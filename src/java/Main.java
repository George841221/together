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
}
