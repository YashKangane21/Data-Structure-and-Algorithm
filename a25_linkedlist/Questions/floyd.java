// check is a loop present in a list or not
// Floyd's cycle finding algorithm

package Questions;

public class floyd {
    public static class node{
        int data;
        node next;

        public node(int data){
            this.data = data;
        }
    }
    public static node head;
    
    public static boolean isCycle(){
        node slow = head;
        node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        head = new node(1);
        head.next = new node(2);
        head.next.next = new node(3);
        head.next.next.next = null;

        // 1->2->3->
        // |       |
        //  ------- 

        System.out.println(isCycle());

    }
}
