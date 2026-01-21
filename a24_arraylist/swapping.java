package a24_arraylist;

import java.util.ArrayList;

public class swapping {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Before swapping : " + list);
        int idx1 = 1, idx2 = 3;
        swap(list, idx1, idx2);
        System.out.println("After swapping : " + list);
        
    }
}
