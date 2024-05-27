package Group3;

public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        //Solution 1
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0; 
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j]; 
                
                if (currentSum > maxSum) {
                    maxSum = currentSum; 
                }
            }
        }
        System.out.println(maxSum);

       //Solution 2
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int maxSum2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum < 0) {
                sum = 0;
            }else if(sum > maxSum2){
                maxSum2 = sum;
            }
        }

        System.out.println(maxSum2);
    }
    
}