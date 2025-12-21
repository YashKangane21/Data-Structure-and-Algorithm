package a6_sorting;
public class quickSort {
    public static int partition(int arr[], int st, int end){
        int pivot = arr[end];
        int i = st - 1;

        for(int j = st; j < end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void quicksort(int arr[], int st, int end){
        if(st < end){
            int pivIdx = partition(arr, st, end);
            quicksort(arr, st, pivIdx - 1);
            quicksort(arr, pivIdx + 1, end);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        int size = arr.length;

        int st = 0;
        int end = size - 1;

        quicksort(arr, st, end);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
