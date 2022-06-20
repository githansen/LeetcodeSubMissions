package Lists.Medium;

import java.util.ArrayList;

public class Medium {
    // https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> liste = new ArrayList<>();
        while(head != null){
            liste.add(head.val);
            head = head.next;
        }
        int sum = 0;
        int plass = 1;
        for(int i = liste.size()-1; i >= 0; i--){
            if(liste.get(i) == 1){
                sum += plass;
            }
            plass *= 2;
        }
        return sum;
    }
}
