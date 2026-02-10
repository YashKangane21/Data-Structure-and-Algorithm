// add ---> O(1)
// remove ---> O(n)
// peek ---> O(n)
// not optimized

package a27_queue.implementation;

import java.util.Stack;

public class queueUsing2Stack2 {
    public static Stack<Integer> s1 = new Stack<>();
    public static Stack<Integer> s2 = new Stack<>();

    public static void add(int data){
        s1.push(data);
    }

    public static int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int del = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return del;
    }
    
    public static int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int top = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return top;
    }
    public static void main(String[] args) {    
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);

        remove();
        remove();

        System.out.println(s1);
        // System.out.println(peek());

    }
}
