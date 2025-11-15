package a6_sorting;
public class insertion {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--; 
            }
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,1,4,2};
        System.out.println("Before Sorting :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        insertionSort(arr);
        System.out.println("\nAfter Sorting :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
