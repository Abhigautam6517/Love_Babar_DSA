public class Palindrome {

    class Node{
        int data;
        Node next;
    }
    
    private static Node findMid(Node head) {
        if (head == null) return null;
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    private static Node reverseList(Node A) {
        Node cur = A;
        Node next = null;
        Node prev = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    boolean isPalindrome(Node head) 
    {
        Node mid = findMid(head);
        Node a = head;
        Node b = mid.next;
        mid.next = null;
        b = reverseList(b);
        while(a != null && b != null)
        {
            if(a.data != b.data)
            {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        if(a == null && b == null) { return true;}
        if(a.next == null && b == null){return true;}
        return false;

    }    

}
    
