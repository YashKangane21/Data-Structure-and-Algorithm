package a24_arraylist;

import java.util.ArrayList;

public class pairSum1 {
    public static boolean pair(ArrayList<Integer> nums, int target){
        for(int i=0; i<nums.size(); i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i) + nums.get(j) == target){
                    System.out.println(nums.get(i) + ", " +  nums.get(j));
                    return true;
                }
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
