package algorithm;

/**
 * @author Li Jingwei
 * @date 2020/1/7 上午10:04
 */
public class ReverseBetween {
    //一遍过还阔以
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode newHead = new ListNode(0);
        ListNode tmp = new ListNode(0);
        newHead.next = head;
        ListNode ht,mh,insertTmp,index = newHead;
        for(int i=0;i<m-1;i++) index = index.next;
        ht = index;
        index = index.next;
        mh = index;
        for(int i=m;i<=n;i++) {
            insertTmp = tmp.next;
            tmp.next = index;
            index=index.next;
            tmp.next.next = insertTmp;
        }
        ht.next = tmp.next;
        mh.next = index;
        return newHead.next;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
