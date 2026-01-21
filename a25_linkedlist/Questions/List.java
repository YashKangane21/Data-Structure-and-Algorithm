// check given list is pallindrome or not

package Questions;

public class List {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
    }
    public static node head;
    public static node tail;
    public static int size;

    public void insert(int data){
        node newnode = new node(data);
        size++;
        newnode.next = null;

        if(head == null){
            head = tail =newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public static int x;
    public static int y;

    public void print(){
        node temp = head;
        while(temp != null){
            x = x*10 + temp.data;
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseX(int n){
        n = x;
        while(n > 0){
            int rem = n%10;
            y = y*10 + rem;
            n/=10;
        }
    }
    public static void main(String[] args) {
        List l1 = new List();

        l1.insert(1);
        l1.insert(2);
        l1.insert(2);
        l1.insert(1);

        l1.print();
        l1.reverseX(x);
        System.out.println("x : "+ x);
        System.out.println("x : "+ y);

        if(x == y){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome");
        }        
    }
}
