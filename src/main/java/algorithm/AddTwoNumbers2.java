package algorithm;

import domain.ListNode;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp1 = l1, tmp2 = l2;
        ListNode result = new ListNode();
        ListNode tmp = result;
        int val = 0;
        while(tmp1 != null || tmp2 != null) {
            if(tmp1 != null) {
                val += tmp1.val;
                tmp1 = tmp1.next;
            }
            if(tmp2 != null) {
                val += tmp2.val;
                tmp2 = tmp2.next;
            }
            tmp.next = new ListNode(val%10);
            tmp = tmp.next;
            val /=10;
        }
        if(val != 0) {
            tmp.next = new ListNode(val);
        }
        return result.next;
    }
}
