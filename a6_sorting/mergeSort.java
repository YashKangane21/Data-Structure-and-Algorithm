package a6_sorting;
public class mergeSort {
    public static void merge(int arr[], int st, int mid, int end){
        int temp[] = new int[end - st + 1];
        int idx = 0;

        int i = st;
        int j = mid+1;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[idx++] = arr[i++];
            }else{
                temp[idx++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[idx++] = arr[i++];
        }
        while(j<=end){
            temp[idx++] = arr[j++];
        }

        for(int l=0; l<temp.length; l++){
            arr[st+l] = temp[l];
        }
    }
    public static void mergesort(int arr[], int st, int end){
        if(st < end){
            int mid = (st + end)/2;
            mergesort(arr, st, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, st, mid, end);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        int size = arr.length;

        int st = 0;
        int end = size - 1;

        mergesort(arr, st, end);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
