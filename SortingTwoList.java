

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class SortingTwoList {
    public static void main(String[] args) {
        
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(0);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(9);

        ListNode result = mergeTwoLists(list1, list2);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }

        
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode list3 = new ListNode(0);
        ListNode current = list3;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        }else{
            current.next = list2;
        }

        return list3.next;
        
    }
}
