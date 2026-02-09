//using java collection framework
package a26_stack;
import java.util.Stack;
public class stackC {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);

        s.pop();
        s.pop();
        System.out.println(s.peek());

        System.out.println(s);
    }
    
}
