package Arrays;

public class DiagonalSum {
    public static int diagonal_Sum(int[][] arr){
        int total_Sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            total_Sum+=arr[i][i];
            total_Sum+=arr[i][n-1-i];
        }
        if (n%2!=0){
            total_Sum-=arr[n/2][n/2];
        }
        return total_Sum;
    }
}
