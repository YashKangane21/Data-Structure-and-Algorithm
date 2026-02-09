package a27_queue.implementation;
import java.util.Scanner;
public class circularQueue {
    static int size = 5;
    static int arr[] = new int[size];
    static int front = -1;
    static int rear = -1;

    public boolean isFull(){
        return (rear+1)%size == front;
    }
    public boolean isEmpty(){
        return front == -1;
    }

    public void Add(int data){
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1)%size;
        arr[rear] = data;
    }
    public void Remove(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        int value = arr[front];
        if(front == rear){
            front = rear = -1;  
        }else{
            front = (front + 1)%size;
        }

        System.out.println(value + " deleted");
    }
    public void Peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Front : " + arr[front]);
    }
    public void Display(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue elements :");
        int i = front;
        while(true){
            System.out.print(arr[i] + " ");
            if(i == rear){
                break;
            }
            i = (i+1)%size;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circularQueue q = new circularQueue();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Add (Enqueue)");
            System.out.println("2. Remove (Dequeue)");
            System.out.println("3. Peek (Front & Rear)");
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
