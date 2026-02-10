// add ---> O(n)
// remove ---> O(1)
// peek ---> O(1)
// not optimized

package a27_queue.implementation;

import java.util.Stack;

public class queueUsing2stack {
    public static Stack<Integer> s1 = new Stack<>();
    public static Stack<Integer> s2 = new Stack<>();
    public static void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public static int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return s1.pop();
    }
    
    public static int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return s1.peek();
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


    }
}  
