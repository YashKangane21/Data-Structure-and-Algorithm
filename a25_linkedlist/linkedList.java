// public class linkedList {
//     public class node {
//         int data;
//         node next;

//         public node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static node head;
//     public static node tail;

//     public void addFirst(int data){
//         node newnode = new node(data);

//         if(head == null){
//             head = tail = newnode;
//             return;
//         }

//         newnode.next = head;
//         head = newnode;
//     }

//     public void addLast(int data){
//         node newnode = new node(data);

//         if(head == null){
//             head = tail = newnode;
//             return;
//         }
//         tail.next = newnode;
//         tail = newnode;
//     }

//     public void print(){
//         if(head == null){
//             System.out.println("List is empty");
//             return;
//         }
//         node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public void addAt(int pos, int val){
//         if(head == null && pos > 1){
//             System.out.println("Incorrect position!");
//             return;
//         }

//         node temp = head;
//         int count = 0;

//         while(temp!= null){
//             count++;
//             temp = temp.next;
//         }

//         if(count+1 < pos){
//             System.out.println("Incorrect position!");
//             return;
//         }

//         node newnode = new node(val);
//         temp = head;
//         count = 1;

//         if(pos == 1){
//             newnode.next = head;
//             head = newnode;
//             return;
//         }

//         while(temp != null && count<pos-1){
//             count++;
//             temp = temp.next;
//         }
//         newnode.next = temp.next;
//         temp.next = newnode;

//     }
//     public static void main(String[] args) {
//         linkedList l1 = new linkedList();
//         l1.addFirst(1);
//         l1.addFirst(2);
//         l1.addLast(3);
//         l1.addLast(4);
//         l1.addAt(5,10);
//         l1.print();
//     }
// }
