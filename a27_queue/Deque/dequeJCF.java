// deque - double ended queue
//---------- operatoins --------------
//add -> addFirst(el), addLast(el)
//remove -> removeFirst(), removeLast()
//peek -> getFirst(), getLast()

package a27_queue.Deque;
import java.util.*;
public class dequeJCF {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(3);
        dq.addLast(4);
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addFirst(0);
        dq.addLast(5);

        dq.removeLast();
        dq.removeFirst();

        System.out.println(dq);
        System.out.println("First : " + dq.getFirst());
        System.out.println("Last : " + dq.getLast());
    }
}
