

public class DetechLoop {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
        public static boolean detectLoop(Node head){  
            if(head==null){
                 return false;
             }
            Node slowPointer = head;
            Node fastPointer = head;
            while(slowPointer!=null && fastPointer!=null && fastPointer.next!=null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
                if(slowPointer == fastPointer) 
                  return true;
            }
            return false;
        }
    }
    

