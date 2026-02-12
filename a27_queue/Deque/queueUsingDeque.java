package a27_queue.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class queueUsingDeque {
    static class queue{
        Deque<Integer> dq = new LinkedList<>();

        public void add(int x){
            dq.addLast(x);
        }
        public int remove(){
            if(dq.isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }
            return dq.removeFirst();
        }
        public int peek(){
            if(dq.isEmpty()){
                return -1;
            }
            return dq.getFirst();
        }
        public void display(){
            if(dq.isEmpty()){
                System.out.println("Queue is empty!");
                return;
            }
            System.out.println(dq);
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Popped : " + q.remove());
        System.out.println("Popped : " + q.remove());

        q.display();

        System.out.println("Peek : " + q.peek());
        
    }
}
