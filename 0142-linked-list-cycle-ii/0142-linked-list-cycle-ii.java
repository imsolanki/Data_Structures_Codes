public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head, fast=head;//initialize with head
        while(fast != null && fast.next != null ){
            slow=slow.next;//increace slow by 1
            fast=fast.next.next;//increase fast by 2

            if(slow == fast){
                slow=head;
                while(slow != fast){//until slow not equal to fast move slow and fast one by one
                slow=slow.next;
                fast=fast.next;
                }
                return slow;//return where cycle form
            }
        }
        return null;//if there is no cycle form

    }
}