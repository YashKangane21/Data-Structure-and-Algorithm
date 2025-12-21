// print numbers from 10 to 1
package a11_recursion;
class printNum{
    // 1
    public static void printDec(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        func(n-1);
    }
    
    //2
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    //3
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int ans =  n * fact(n-1) ;
        return ans;
    }

    //4
    public static int sumN(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sumN(n-1);
        return sum;
    }

    //5 fibonacci series
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int ans = fibonacci(n-1) + fibonacci(n-2);

        return ans;
    }

    // check array is sorted or not
    public static boolean checkArray(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        checkArray(arr, i+1);
        return true;
    }

    //7 - 
    public static int checkFirstOccurence(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        } 
        return checkFirstOccurence(arr, key, i+1);
    }

    //8 x^n , calulate x to the power n

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int result = x * power(x, n-1);
        return result;
    }
    
    //remove duplicate from string
    public static void removeDuplicate(){
        String  a = "yyaasshhkkaannggaannee";
        System.out.println(a);

    }
    public static void main(String[] args){
        // int arr[] = {1,2,34,4,5};  
        // int key = 34;
        // // System.out.println(checkFirstOccurence(arr, key, 0));
        // System.out.println(power(2,10));
        removeDuplicate();
    }
}