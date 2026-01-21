package Questions;

public class removeCycle {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
    }
    public static node head;
    public static node slow;
    public static node fast;
    public static boolean isCycle(){
        slow = head;
        fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
    public static void removeLoop(){
        if(!isCycle()){
            System.out.println("There is no cycle");
            return;
        }

        slow = head;
        node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;

    }
    public static void print(){
        node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = new node(4);
        head.next.next.next.next = head.next;

        // print();

       removeLoop();
       print();

    }
}
