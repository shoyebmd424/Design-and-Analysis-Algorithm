import java.util.LinkedList;

public class Floyeds {
    static boolean cycledetect(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
class Node {
    Node next;
    int val;
    Node(int val,Node next){
        this.next=null;
        this.val=val;
    }
}
