package Arrays;

public class TotalEven {
    public static int total_Even(int[] arr){
        int even_Counter = 0;
        for(int number : arr){
            if (countDigit(number)%2==0) {
                even_Counter++;
            }
        }
        return even_Counter;
    }
    private static int countDigit(int number){
        int count = 0;
        while(number>0){
            count++;
            number /= 10;
        }
        return number;
    }
}
