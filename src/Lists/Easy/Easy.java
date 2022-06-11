package Lists.Easy;

public class Easy {
    // https://leetcode.com/problems/reverse-linked-list
   /* public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode neste = head.next;
        ListNode nyneste = neste.next;
        head.next = null;
        while(neste != null){
            neste.next = head;
            head=neste;
            neste = nyneste;
            if(nyneste != null){
                nyneste = nyneste.next;
            }
        }
        return head;
    }*/
}
