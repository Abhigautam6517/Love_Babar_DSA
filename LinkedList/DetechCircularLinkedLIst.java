public class DetechCircularLinkedLIst {
    

    class  Node{
        int data;
        Node next;
    }

    boolean isCircular(Node head)
    {
	
	Node temp = head;
	if(head==null){
	    return false;
	}
    while(temp.next!=head){
        temp = temp.next;
        if(temp==null){
            break;
        }
        
    }
    if(temp==null){
        return false;
    }
    else{
        return true;
    }
}
}
    
