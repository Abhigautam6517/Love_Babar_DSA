
class OddEven{

    class Node{
        int data;
        Node next;
    }
    Node divide(int N, Node head){
        Node e_start = null;
        Node e_end = null;
        Node o_start = null;
        Node o_end =  null;
        Node curr = head;
        while(curr != null ){
            int ele = curr.data;
            if(ele %2 == 0){
                if(e_start == null ){
                    e_start = curr;
                    e_end = e_start;
                }else{
                    e_end.next = curr;
                    e_end = e_end.next;
                }
            }else{
                if(o_start == null ){
                    o_start = curr;
                    o_end = o_start;
                }else{
                    o_end.next = curr;
                    o_end = o_end.next;
                } 
            }
            curr = curr.next;
        }
        if(e_start == null || o_start == null ){
            return head;
        }
        e_end.next = o_start;
        o_end.next = null;
        head = e_start;
        return head;
    }
}