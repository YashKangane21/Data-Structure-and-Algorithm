package a24_arraylist;
import java.util.ArrayList;
public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add method 1
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(70);

        //add method 2 (insert 30 at index 2 and 60 at idx 5)
        list.add(2,30);
        list.add(5,60);

        //remove method
        list.remove(4);
        
        //get method
        System.out.println(list.get(2));

        //set method
        list.set(4,50);
        list.set(5,60);

        //contains method
        System.out.println(list.contains(30));
        System.out.println(list.contains(70));

        //print
        System.out.println(list);
        System.out.println("size :" + list.size());
    }
}
