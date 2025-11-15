package a6_sorting;
import java.util.Arrays;
public class inbuiltSort {
    public static void main(String[] args) {
        int arr[] = {9,7,6,5,3,2};
        System.out.println("Before Sorting :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nAfter Sorting :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
