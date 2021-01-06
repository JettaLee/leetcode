package algorithm;

import domain.ListNode;

/**
 * 2. Add Two Numbers
 * 遇到问题：while循环没有加判断bit != 0；判断两个ListNode如果有一个为0直接返回另一个，这个首先可以去掉，其次不能只判断
 * l1.val还得判断l1.next == null
 *
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1,p2 = l2;
        ListNode ans = new ListNode(0);
        int bit = 0;
        ListNode tt = ans;
        while(p1 != null || p2 != null || bit != 0) {
            ListNode t = new ListNode(0);
            if(p1 != null) {
                t.val += p1.val;
                p1 = p1.next;
            }
            if(p2 != null) {
                t.val += p2.val;
                p2 = p2.next;
            }
            t.val += bit;
            if(t.val >= 10) {
                bit = 1;
                t.val -= 10;
            } else {
                bit = 0;
            }
            tt.next = t;
            tt = tt.next;
        }
        return ans.next;
    }
}
