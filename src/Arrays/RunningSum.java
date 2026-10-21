package Arrays;

public class RunningSum {
    public static int[] runningSum(int[] arr){
        int current_Sum=0;
        int[] newarr = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            current_Sum+=arr[i];
            newarr[i]=current_Sum;
        }
        return newarr;
    }
}
