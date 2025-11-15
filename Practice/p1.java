package Practice;

public class p1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j<arr.length; j++){
                int currSum = 0;
                for(int k = i; k<=j; k++){
                    currSum += arr[k];
                }
                if(currSum < minSum){
                    minSum = currSum;
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum : " + maxSum);
        System.out.println("Min Sum : " + minSum);
    }
}
