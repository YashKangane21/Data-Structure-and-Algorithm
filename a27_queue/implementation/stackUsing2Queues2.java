//push - O(n)
//pop - O(1)
//peek - O(1)

package a27_queue.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsing2Queues2 {
    static class stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty();
        }

        public void push(int data){
            q2.add(data);

            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            int top = q1.remove();
            return top;
        }
        
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            return q1.peek();
        }
    }


    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);        
        s.push(2);        
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s.q1);
    }
}
