package a6_sorting;

public class selection {
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,1,4,2};
        System.out.println("Before Sorting :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        selectionSort(arr);

        System.out.println("\nAfter Sorting :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
