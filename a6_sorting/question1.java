// search in rotated sorted array
package a6_sorting;

public class question1 {
    public static int search(int arr[], int st, int end, int key){
        if(st <= end){
            int mid = (st + end)/2;
            if(arr[mid] == key){
                return mid;
            }

            //on line 1
            if(arr[st] <= arr[mid]){

                // left 
                if(arr[st] <= key && key <= arr[mid]){
                    return search(arr, st, mid - 1, key);
                }

                //right
                else{
                    return search(arr, mid + 1, end, key);
                }
            }

            // on line 2
            else{
                //left
                if(arr[mid] <= key && key <= arr[end]){
                    return search(arr, mid + 1, end, key);
                }
                //right
                else{
                    return search(arr, st, mid - 1, key);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,9,10,1,2,3};
        int st = 0;
        int end = arr.length - 1;

        System.out.println(search(arr, st, end,2));
    }
}
