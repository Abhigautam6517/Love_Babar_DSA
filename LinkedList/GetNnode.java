public class GetNnode {
    class Node{
        int data;
        Node next;
    }

   int getNthFromLast(Node head, int n)
    {
    	int count=0;
    	Node temp=head;
    	while(temp!=null){
    	    count++;
    	    temp=temp.next;
    	}
    	Node curr=head;
    	for(int i=0;i<count;i++){
    	   
    	    if(i==count-n){
    	        return curr.data;
    	    }
    	    curr=curr.next;
    	}
    	return -1;
    }
}

    

