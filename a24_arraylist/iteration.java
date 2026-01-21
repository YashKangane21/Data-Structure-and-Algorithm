package a24_arraylist;
import java.util.ArrayList;
public class iteration {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //for loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //reverse print
        // for(int i = list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i) + " ");
        // }

        // maximum value
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     max = Math.max(max, list.get(i));

        // }
        // System.out.println("Max :" + max);
    }
}
