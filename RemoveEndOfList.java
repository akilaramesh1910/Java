
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class RemoveEndOfList{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        ListNode result = RemoveNode(head, n);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode RemoveNode(ListNode head, int n) {

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i = 0; i <= n + 1; i++){
            fast = fast.next;
        }

        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
        
    }
}