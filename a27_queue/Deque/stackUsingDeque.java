package a27_queue.Deque;
import java.util.*;
public class stackUsingDeque {
    static class stack{
        Deque<Integer> dq = new LinkedList<>();

        public void push(int x){
            dq.addLast(x);
        }
        public int pop(){
            if(dq.isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            return dq.removeLast();
        }
        public int peek(){
            if(dq.isEmpty()){
                return -1;
            }
            return dq.getLast();
        }
        public void display(){
            if(dq.isEmpty()){
                System.out.println("Stack is empty!");
                return;
            }
            System.out.println(dq);
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Popped : " + s.pop());
        System.out.println("Popped : " + s.pop());
        System.out.println("Popped : " + s.pop());
        s.display();
        System.out.println(s.peek());
    }
}
