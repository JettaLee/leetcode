package algorithm;

/**
 * @author Li Jingwei
 * @date 2019/10/8 上午10:34
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        Integer i = null;
        ListNode newHead = new ListNode(head.val-1);
        newHead.next = head;
        ListNode tmp = newHead;
        while(tmp.next != null) {
            if(i != null && tmp.next.val == i) {
                tmp.next = tmp.next.next;
                continue;
            }
            if(tmp.next.next != null && tmp.next.val == tmp.next.next.val) {
                i = tmp.next.val;
                tmp.next = tmp.next.next.next;
                continue;
            }
            tmp = tmp.next;
        }
        return newHead.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

