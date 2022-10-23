class IntersectionPoints
{
    class Node{
        int data;
        Node next;
    }
    static int findLength(Node head) {
        Node cur = head;
        int len = 0;
        while(cur!=null) {
            len++;
            cur = cur.next;
        }
        return len;
    }
 int intersectPoint(Node head1, Node head2)
 {
         int cnt1 = findLength(head1);
         int cnt2 = findLength(head2);
         if(cnt1>cnt2) {
             int diff = cnt1 - cnt2;
             Node cur = head1;
             while(diff!=0) {
                 diff--;
                 cur = cur.next;
             }
             Node cur1 = head2;
             while(cur!=null && cur1!=null) {
                 if(cur==cur1) {
                     return cur.data;
                 }
                 cur = cur.next;
                 cur1 = cur1.next;
             }
         } 
         else{
             int diff = cnt2 - cnt1;
             Node cur = head2;
             while(diff!=0) {
                 diff--;
                 cur = cur.next;
             }
             Node cur1 = head1;
             while(cur!=null && cur1!=null) {
                 if(cur==cur1) {
                     return cur.data;
                 }
                 cur  = cur.next;
                 cur1 = cur1.next;
             }
         }
         return 0;
 }
}

