package Questions;

public class question2 {
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
    public node getMid(node head){
        node slow = head;
        node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;       //+1
            fast = fast.next.next;  //+2
        }
        return slow;    // mid node
    }
    public node merge(node head1, node head2){
        node mergedLL = new node(-1);
        node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }
    public node mergeSort(node head){

        if(head == null || head.next == null){
            return head;
        }
        //mid
        node mid = getMid(head);
        node rightHead = mid.next;
        mid.next = null;

        //left & right sort
        node head1 = mergeSort(head);
        node head2 = mergeSort(rightHead);

        //merge
        return merge(head1, head2);
    }

    public void zigzag(){
        // find middle
        node slow = head;
        node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        node mid = slow;

        //reverse 2nd half
        node curr = mid.next;
        mid.next = null;
        node prev = null;
        node Next;
        while(curr != null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }

        Node 

        //alternate merge
    }
    public static void main(String[] args) {
        question2 l1 = new question2();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(-1);

        l1.print();
        head = l1.mergeSort(head);
        l1.print();

    }
}
