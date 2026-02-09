package doublyLL;

public class doubleLL {
    class node{
        int data;
        node prev, next;
        public node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static node head = null;
    public static node tail = null;
    public static int size;

    public void addLast(int data){
        node newnode = new node(data);
        size++;

        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public void addFirst(int data){
        node newnode = new node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        if(head.next == null){
            size--;
            head = tail = null;
            return;
        }

        node del = head;
        head = head.next;
        head.prev = null;
        del.next = null;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        if(head.next == null){
            size--;
            head = tail = null;
            return;
        }
        node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null; 
        size--;    
    }
    public void print(){
        node temp = head;
        while (temp != null){ 
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } 
        System.out.print("null");
    }
    public void reverse(){
        if(head == null || head.next == null){
            return;
        }
        node temp = head;
        node curr = head;
        node Prev = null;
        node Next;
        while(curr != null){
            Next = curr.next;
            curr.next = Prev;
            curr.prev = Next;
            Prev = curr;
            curr = Next;
        }
        head = Prev;
        tail = temp;
    }
    public static void main(String[] args) {
        doubleLL list = new doubleLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);  //1<->2<->3<->4<->null

        // list.addFirst(0);
        // list.addFirst(-1);      //-1<->0<->1<->2<->3<->4<->null

        // list.removeFirst();
        // list.removeLast();
        list.reverse();
        list.print();
        System.out.println("\nSize : " + size);
    }
}
