package a5_array;

public class subArrays {
    public static void subarray(int arr[]){

        int total_subarray = (arr.length * (arr.length + 1))/2 ;
        int arr2[] = new int[total_subarray];
        int l = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                System.out.print("[ ");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    sum+=arr[k];
                }
                System.out.print(" ]");
                arr2[l++] = sum;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total subarrays :" + total_subarray);
        System.out.println("Sum of subarrays : ");

        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + "  ");
        }
        maxMinSum(arr2);
    }
    public static void maxMinSum(int arr2[]){
        int max = Integer.MIN_VALUE; // - infinity
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr2.length; i++){
            if(arr2[i] > max){
                max = arr2[i];
            }
            if(arr2[i] < min){
                min = arr2[i];
            }
        }
        System.out.print("\n\nSmallest Subarray Sum : " + min);
        System.out.print("\nLargest Subarray Sum : " + max);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        subarray(arr);
    }
}
