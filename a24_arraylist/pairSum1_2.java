package a24_arraylist;

import java.util.ArrayList;

public class pairSum1_2 {
    public static boolean pair(ArrayList<Integer> nums, int target){
        int st = 0;
        int end = nums.size() - 1;

        while(st < end){
            int a = nums.get(st);
            int b = nums.get(end);
            if(a+b == target){
                System.out.println(a + ", "+ b);
                return true;
            }else if(a+b < target){
                st++;
            }else{
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        int target = 5;
        pair(nums, target);
    }
}
