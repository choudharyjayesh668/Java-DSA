package Arrays;

public class MaximumWealth {
    public static int maximumWealth(int[][] arr){
        int maxValue=0;
        for(int i=0;i<arr.length;i++){
            int currentWealth=0;
            for (int j=0;j<arr[i].length;j++){
                int colValue=arr[i][j];
                currentWealth+=colValue;
            }
            maxValue=Math.max(currentWealth,maxValue);
        }
        return maxValue;
    }
}
