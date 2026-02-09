package a26_stack.questions;

import java.util.Stack;

// import java.util.Scanner;

// public class bottomInsert {
//     static class node{
//         int data;
//         node next;

//         public node(int data){
//             this.data = data;
//         }
//     }
//     public static node top;

//     //isEmpty
//     boolean isEmpty(){
//         return top == null;
//     }
//     //push (insert at head)
//     void push(int data){
//         node newnode = new node(data);
//         newnode.next = top;
//         top = newnode;

//         System.out.println("Element " + data + " pushed");
//     }

//     //pop (remove from head)
//     void pop(){
//         if(isEmpty()){
//             System.out.println("List is empty!");
//             return;
//         }
//         System.out.println("Element " + top.data + " popped");
//         top = top.next;
//     }
//     //peek
//     void peek(){
//         if(isEmpty()){
//             System.out.println("List is empty!");
//             return;
//         }
//         System.out.println("Top : "+ top.data);
//     }

//     void insertAtBottom(int data){
//         node newnode = new node(data);
//         newnode.next = null;

//         if(isEmpty()){
//             top = newnode;
//             return;
//         }
//         node temp = top;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = newnode;
//     }
//     //print
//     void print(){
//         if(isEmpty()){
//             System.out.println("List is empty!");
//             return;
//         }
//         node temp = top;
//         while(temp!=null){
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         bottomInsert s = new bottomInsert();
//         Scanner sc = new Scanner(System.in);
//         int data, choice;
//         do { 
//             System.out.println("---------------");
//             System.out.println("1 - Push");
//             System.out.println("2 - Pop");
//             System.out.println("3 - Peek");
//             System.out.println("4 - Bottom Insert");
//             System.out.println("5 - Print");
//             System.out.println("6 - Exit");
//             System.out.println("----------------");

//             System.out.print("\nEnter your choice : ");
//             choice = sc.nextInt();

//             switch(choice){
//                 case 1 :
//                     System.out.print("Enter data : ");
//                     data = sc.nextInt();
//                     s.push(data);
//                     break;
//                 case 2 :
//                     s.pop();
//                     break;
//                 case 3 :
//                     s.peek();
//                     break;
//                 case 4:
//                     System.out.print("Enter data : ");
//                     data = sc.nextInt();
//                     s.insertAtBottom(data);
//                     break;
//                 case 5:
//                     s.print();
//                     break;
//                 case 6:
//                     return;
//                 default :
//                     System.out.println("Enter valid choice!");                    
//             }

//         } while (choice != 6);
//     }
// }


public class bottomInsert{
    public static void insertAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);

        insertAtBottom(s, 4);
        System.out.println(s);
    }
}