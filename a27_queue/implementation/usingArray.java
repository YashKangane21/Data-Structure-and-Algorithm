package a27_queue.implementation;
import java.util.Scanner;
public class usingArray {
    static int size = 5;
    static int arr[] = new int[size];
    static int front = -1;
    static int rear = -1;

    public void Add(int data){
        if(rear == size -1){
            System.out.println("Queue is full!");
            return;
        }
        if(front == -1){
            front = rear = 0;
            arr[rear] = data;
            return;
        }

        arr[++rear] = data;
    }
    public void Remove(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is empty!");
            return;
        }
        if(front == rear){
            front = rear = -1;
            return;
        }
        front++;
    }
    public void Peek(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Front :" + arr[front]);
        System.out.println("Rear :" + arr[rear]);
    }
    public void Display(){
        if(front == -1 && rear == -1){
            System.out.println("Queue is empty!");
            return;
        }
        for(int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        usingArray q = new usingArray();
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
