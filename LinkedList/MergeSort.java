public class MergeSort {
    class Node{
        int data;
        Node next;
    }
{

    static Node mergeSort(Node head){
     if(head==null || head.next==null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(head2);
        return merge(left ,right);
    }
   
     public static Node merge(Node left,Node right){
            if(left==null){return right;}
            if(right==null){return left;}
        if(left.data < right.data) 
        {
            left.next = merge(left.next, right);
            return left;
        }
        else 
        {
            right.next = merge(left, right.next);
            return right;
        }

    }   
}
}
