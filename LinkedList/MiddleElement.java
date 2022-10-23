public class MiddleElement {
    class ListNode{
        int data;
        ListNode next;
    }
        public ListNode middleNode(ListNode head) {
                        ListNode fast=head;
                       ListNode slow=head;
                while(fast!=null&&fast.next!=null){
                    slow=slow.next;
                    fast=fast.next.next;
                }
                return slow;
        }
   }
    
