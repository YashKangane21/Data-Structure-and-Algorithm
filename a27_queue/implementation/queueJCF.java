// implementation of queue using java collection framework

package a27_queue.implementation;
import java.util.*;
public class queueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.remove();
        q.remove();
        q.remove();

        q.add(6);
        q.add(7);

        for(int li : q){
            System.out.print(li + " ");
        }
    }
}
