import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int min = 1, max = 39;
        int slots = 7;
        int [] lottoArray = new int[slots];
        boolean isRepeated;
        int randomNum = 0;

        for(int i = 0; i < slots; i++){
            do {
                isRepeated = false;
                randomNum = random.nextInt(max + 1 - min) + min;
                for (int k = 0; k <= i; k++){
                    if (lottoArray[k] == randomNum){
                        isRepeated = true;
                        break;
                    }
                }
            }while (isRepeated);
            lottoArray[i] = randomNum;
        }
        Arrays.sort(lottoArray);
        System.out.println("The result is: ");
        for (int i = 0; i < slots; i++){
            System.out.print(lottoArray[i] + " ");
        }
    }
}
