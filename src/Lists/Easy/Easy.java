package Lists.Easy;

import Lists.Medium.ListNode;

public class Easy {
    // https://leetcode.com/problems/reverse-linked-list
    public ListNode reverseList(ListNode head) {
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
    }
    //https://leetcode.com/problems/middle-of-the-linked-list/
  /*  public ListNode middleNode(ListNode head) {
        int antall = 0;
        ListNode temp = head;
        while(head != null){
            head = head.next;
            antall++;
        }
        for(int i = 0; i < antall/2; i++){
            temp = temp.next;
        }
        return temp;
    }*/




    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    /*
        public ListNode removeNthFromEnd(ListNode head, int n) {
        int antall = 0;
        ListNode temp = head;
        ListNode temp2 = head;
        while(head != null){
            antall++;
            head = head.next;
        }
          for(int i = 1; i < antall-n; i++){
        temp=temp.next;
    }
        if(n > antall)return temp2;
        if(n == antall)return temp.next;
         if(temp.next != null){
                temp.next = temp.next.next;
            }
        return temp2;

    }
     */
}
