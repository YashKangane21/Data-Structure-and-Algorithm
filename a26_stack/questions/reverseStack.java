package a26_stack.questions;
import java.util.Stack;
public class reverseStack {
    public static void insertAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int val = s.pop();
        insertAtBottom(s, data);
        s.push(val);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int val = s.pop();
        reverse(s); 
        insertAtBottom(s, val);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
}
