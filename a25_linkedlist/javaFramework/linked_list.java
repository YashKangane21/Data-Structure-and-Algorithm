package javaFramework;
import java.util.LinkedList;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        // add
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.addFirst(0);

        // 0->1->2->null

        //remove
        list.removeLast();
        list.removeFirst();

        // 1->2->null

        //print
        System.out.println(list);
    }
}
