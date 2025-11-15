package a5_array;

public class ReverseArray {
    public static void reverse(int arr[]){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int temp = arr[left];
            arr[left] = arr[right];
            arrn[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        reverse(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
