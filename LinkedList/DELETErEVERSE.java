public class DELETErEVERSE {
    class Node{
        int data;
        Node next;
    }

    public static Node deleteNode(Node head,int d)

    {

        if(head==null)return null;

        Node curr=head;

        Node temp=head;

        

        

        while(curr.data!=d){

            curr=curr.next;

        }

        

        while(temp.next!=curr){

            temp=temp.next;

        }

        temp.next=temp.next.next;

        

        

        return head;

        

        

    }

    //This method returns the head node of the reversed Linked list.

    public static Node reverse(Node head)

    {

        if(head==null)return null;

        Node curr=head;

        Node next=null;

        Node prev=null;

        

        while(curr!=null){

            next=curr.next;

            

            curr.next=prev;

            prev=curr;

            curr=next;

            

           

        }

         return prev.next;

            

    }

}
    

