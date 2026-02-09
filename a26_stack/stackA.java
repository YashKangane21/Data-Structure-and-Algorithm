// implementation using ArrayList
package a26_stack;

import java.util.ArrayList;
import java.util.Scanner;

public class stackA {
    ArrayList<Integer> list = new ArrayList<>();

    //isEmpty
    boolean isEmpty(){
        return list.isEmpty();
    }

    //push
    void push(int data){
        list.add(data);
        System.out.println("Element " + data + " pushed");
    }

    //pop
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        int val = list.get(list.size() - 1);
        System.out.println("Element " + val + " popped");
        list.remove(list.size() -1);
        return val;
    }
    //peek
    void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        int val = list.get(list.size() - 1);
        System.out.println("Top : " + val );
    }

    //print
    void print(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        stackA s = new stackA();
        Scanner sc = new Scanner(System.in);
        int data, choice;
        do { 
            System.out.println("---------------");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Peek");
            System.out.println("4 - Print");
            System.out.println("5 - Exit");
            System.out.println("----------------");

            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1 :
                    System.out.print("Enter data : ");
                    data = sc.nextInt();
                    s.push(data);
                    break;
                case 2 :
                    s.pop();
                    break;
                case 3 :
                    s.peek();
                    break;
                case 4:
                    s.print();
                    break;
                case 5:
                    return;
                default :
                    System.out.println("Enter valid choice!");                    
            }

        } while (choice != 5);
    }
}
