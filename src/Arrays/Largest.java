package Arrays;

public class Largest {
    public static int largest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int current_largest=arr[i];
            largest = Math.max(current_largest,largest);
        }
        return largest;
    }
}
