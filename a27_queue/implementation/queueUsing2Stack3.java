// add ---> O(1)
// remove --->Amortized O(1)
// peek ---> AmortizedO(1)
// optimized ✅

package a27_queue.implementation;

import java.util.Stack;

public class queueUsing2Stack3 {
    public static Stack<Integer> s1 = new Stack<>();
    public static Stack<Integer> s2 = new Stack<>();

    public static void add(int data){
        s1.push(data);
    }

    public static int remove(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());    
            }
        }
        return s2.pop();
    }
    
    public static int peek(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public static void main(String[] args) {    
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);

        remove();
        remove();

        add(6);
        add(7);

        System.out.println(s1);
        System.out.println(s2);
    }
}