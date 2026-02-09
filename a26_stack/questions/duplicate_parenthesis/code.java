package a26_stack.questions.duplicate_parenthesis;
import java.util.Stack;
public class code {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;
            if(ch == ')'){
                while(!s.isEmpty() && s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;
                }else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "(((a+b)+(c-d)))";
        String str2 = "((()))";
        String str3 = "((a+b)+(c-d))";
        // String str1 = "(((a+b)+(c-d)))";
        System.out.println(isDuplicate(str3));
    }
}
