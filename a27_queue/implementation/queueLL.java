package a27_queue.implementation;

import java.util.Scanner;

public class queueLL {
    public static class node{
        int data;
        node next;
        
        public node(int data){
            this.data = data;
        }
    }
    public static node front;
    public static node rear;

    //insert at last
    public void Add(int data){
        node newnode = new node(data);
        newnode.next = null;

        if(front == null){
            front = rear = newnode;
            return;
        }

        rear.next = newnode;
        rear = newnode;
    }

    //remove from begin
    public void Remove(){
        if(front == null){
            System.out.println("Queue is empty!");
            return;
        }
        node del = front;
        System.out.println(del.data + " deleted!");
        
        if(front == rear){
            front = rear = null;
            return;
        }
        
        front = del.next;
    }
    public void Peek(){
        if(front == null){
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Front : " + front.data);
        
    }
    public void Display(){
        if(front == null){
            System.out.println("Queue is empty!");
            return;
        }

        node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    

    public static void main(String[] args) {
        queueLL q = new queueLL();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Add (Enqueue)");
            System.out.println("2. Remove (Dequeue)");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter element to add: ");
                    int data = sc.nextInt();
                    q.Add(data);
                    break;

                case 2:
                    q.Remove();
                    break;

                case 3:
                    q.Peek();
                    break;
                case 4:
                    q.Display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 5);
        sc.close();
    }
}
