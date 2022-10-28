import java.util.Stack;

public class DeleteNodeRightvalue {
    class Node{
        int data;
        Node next;
    }
    public static Node reverse(Node head){
        Node cur=head;
        Node prev=null;
        Node temp;
        while(cur!=null){
            temp =cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    Node compute(Node head)
    {
        Stack<Integer> stack = new Stack<>();
        Node curr = head;
        while(curr != null){
            if(stack.isEmpty()){
                stack.push(curr.data);
            }else{
                while(!stack.isEmpty() && stack.peek() < curr.data){
                    stack.pop();
                }
                stack.push(curr.data);
            }
            curr = curr.next;
        }
        Node nhead = null, tail = null;
        while(!stack.isEmpty()){
            Node newNode = new Node();
            if(nhead == null){
                nhead = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            stack.pop();
        }
         Node temp=reverse(nhead);
        return temp;
    }
    
}
