public class linkedListMenu {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
    }

    public static node head = null;
    public static node tail = null;
    public static int size;

    public void addFirst(int data){
        node newnode = new node(data);
        size++;

        if(head == null){ //1st node
            newnode.next = head;
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }
    public void addLast(int data){
        node newnode = new node(data);
        size++;

        if(head == null){
            newnode.next = null;
            head = tail = newnode;
            return;
        }
        newnode.next = null;
        tail.next = newnode;
        tail = newnode;

    }
    public void addAt(int pos, int data){
        node newnode = new node(data);
        size++;

        if(size < pos || pos <= 0){
            size--;
            System.out.println("Invalid Position!");
            return;
        }
        if(head == null && pos == 1){
            head = tail = newnode;
            return;
        }
        if(pos == 1){
            newnode.next = head;
            head = newnode;
            return;
        }
        if(pos == size){
            tail.next = newnode;
            tail = newnode;
            return;
        }
        node temp = head;
        int count = 1;

        while(temp != null && count < pos - 1){
            count++;
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void print(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        node temp = head;

        while (temp != null) { 
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //garbage collector automatically delete the memory 
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        
        node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void removeFrom(int pos){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        if(pos > size || pos<=0){
            System.out.println("Incorrect position!");
            return;
        }
        if(pos == 1 && head.next == null){
            head = tail =  null;
            size--;
            return;
        }
        if(pos == 1){
            head = head.next;
            size--;
            return;
        }
        
        node temp = head;
        int count = 1;

        
        while(temp.next != null && count < pos-1){
            temp = temp.next;
            count++;
        }
        node del = temp.next;
        temp.next = del.next;
        if(pos == size){
            tail = temp;
        }
        size--;
    }
    public int search(int key){
        if(head == null){
            System.out.println("List is empty!");
            return -1;
        }
        node temp = head;
        int position = 1;
        while(temp != null){
            if(temp.data == key){
                return position;
            }
            position++;
            temp = temp.next;
        }
        return -1;
    }

    public int helper(node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 1;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    //recursive search
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        node prev = null;
        node curr = tail = head;
        node Next;

        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        head = prev;
    }

    //remove nth node from end
    public void removeNFromEnd(int n){
        if(n <= 0 || n > size){
            System.out.println("Invalid value of n");
            return;
        }
        if(n == size){
            head = head.next;
            size--;
            return;
        }

        int i = 1;
        node prev = head;

        while(i < size-n){
            prev = prev.next;
            i++;
        }
        if(prev.next == tail){
            tail = prev;
        }
        prev.next = prev.next.next;
        size--;
    }
    public static void main(String[] args) {
        linkedListMenu l1 = new linkedListMenu();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);

        // l1.removeFirst();
        // l1.removeLast();
        // l1.removeLast();
        // l1.removeLast();
        // l1.removeFrom(1);
        // l1.removeFrom(1);

        //searching
        // int x = l1.search(2);
        // if(x == -1){
        //     System.out.println("Key not found!");
        //     return;
        // }else{
        //     System.out.println("Key found at position " + x);
        // }

        //recursive search
        // System.out.println(l1.recSearch(4));



        l1.print();
        l1.reverse();
        System.out.println(head.data);
        System.out.println(tail.data);
        l1.print();

        System.out.println("Size : " + l1.size);
    }
}
