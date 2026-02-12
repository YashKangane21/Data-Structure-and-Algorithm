package a27_queue.questions;
import java.util.*;
public class interleaveTwoHalves {
    public static void interleaveQueue(Queue<Integer> q){
        Queue<Integer> newQ = new LinkedList<>();

        int n = q.size();
        for(int i=0; i<n/2; i++){
            newQ.add(q.remove());
        }

        while(!newQ.isEmpty()){
            q.add(newQ.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println("Before Interleave : " + q);
        interleaveQueue(q);
        System.out.println("After Interleave : " + q);
    }
}
