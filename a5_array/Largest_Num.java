package a5_array;
public class Largest_Num {
    public static int largestNum(int arr[]){
        int max = Integer.MIN_VALUE; // - infinity
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest : " + min);
        System.out.println("Largest : " + max);
        return max;

    }
    public static void main(String[] args) {
        int arr[] = {1,8,3,459,64};
        largestNum(arr);
    }
}
