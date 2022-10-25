public class SortDoubleLinkedList {


class Node{
    int data;
    Node next;
    Node prev;
}

 public Node rotateDLL(Node start, int p) {

 Node curr=start;

 Node temp=start;

 Node x=start;

 

 int count=1;

 while(count<p){

     curr=curr.next;

     count++;

 }

 while(temp.next!=null){

     temp=temp.next;

 }

 

 temp.next=start;

 start.prev=temp;

 

 x=curr.next;

 

 curr.next.prev=null;

 curr.next=null;

 

 return  x;

 }


}
