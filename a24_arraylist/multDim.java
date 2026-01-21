package a24_arraylist;

import java.util.ArrayList;

public class multDim {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(9);
        list3.add(10);
        
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        main.add(list1);
        main.add(list2);
        main.add(list3);

        System.out.println(main);

        for(int i=0; i<main.size(); i++){
            ArrayList<Integer> currList = main.get(i);
            for(int j = 0; j<currList.size(); j++ ){
                System.out.print(currList.get(j));
            }
            System.out.println();
        }
    }
}
