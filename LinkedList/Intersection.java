public class Intersection {
    class Node{
        int data;
        Node next;
    }
   public static Node findIntersection(Node head1, Node head2)
    { 
  if(head1==null || head2==null){
       return null;
        }
        Node head=null;
        Node tail=null;
        Node t1=head1;
        Node t2=head2;
        while(t1!=null && t2!=null){
            if(t1.data>t2.data){
                t2=t2.next;
            }
          else if(t1.data==t2.data){
                if(head==null){
                head=t1;
                tail=t1;
            }else{
                tail.next=t1;
                tail=tail.next;
            }
            t1=t1.next;
            t2=t2.next;
            }else{
                t1=t1.next;
            }
        }
        if(head!=null){
            tail.next=null;
        }
        return head;
    }
}
