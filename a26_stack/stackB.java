//implementation using linkedlist
package a26_stack;

import java.util.Scanner;

public class stackB {

    static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
    }
    public static node top;

    //isEmpty
    boolean isEmpty(){
        return top == null;
    }
    //push (insert at head)
    void push(int data){
        node newnode = new node(data);
        newnode.next = top;
        top = newnode;

        System.out.println("Element " + data + " pushed");
    }

    //pop (remove from head)
    void pop(){
        if(isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Element " + top.data + " popped");
        top = top.next;
    }
    //peek
    void peek(){
        if(isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        System.out.println("Top : "+ top.data);
    }
    //print
    void print(){
        if(isEmpty()){
            System.out.println("List is empty!");
            return;
        }
        node temp = top;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        stackB s = new stackB();
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
