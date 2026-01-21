package a12_backtracking;
public class arr {
    public static void createArr(int arr[], int idx, int val){
        if(idx == 5){
            printArr(arr);
            return;
        }
        arr[idx] = val;
        createArr(arr, idx+1, val+1);
        arr[idx] = arr[idx] - 2;
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        createArr(arr,0,1);
        printArr(arr);
    }
}
