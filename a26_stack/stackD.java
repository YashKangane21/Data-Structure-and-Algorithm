package a26_stack;

import java.util.Stack;

public class stackD {
    public static void calcNextGreater(int nums[], int result[]){
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && nums[i] <= nums[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = nums[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int nums[] = {6,8,0,1,3};
        int result[] = new int[nums.length];
        calcNextGreater(nums, result);

        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}

