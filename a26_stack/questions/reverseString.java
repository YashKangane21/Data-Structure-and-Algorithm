package a26_stack.questions;

import java.util.Stack;

public class reverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while(!s.isEmpty()){
            reversed.append(s.pop());
        }

        return reversed.toString();
    }
    public static void main(String[] args) {
        String str = "yash";
        System.out.println(str);
        System.out.println(reverse(str));
    }
}
