public class DeleteNode {
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
   static Node head = null;
   static Node tail = null;
   Node next  = null;
    
   void addNode(int data){
        Node new_node = new Node(data);
        if(head == null){
            head  = new_node;
            tail = new_node;
        }
        else{
            tail.next= new_node;
            tail = new_node;
        }

    }
    void removeNode(){
       Node curr = head;
       while(curr.next.next!=null){
        curr = curr.next;
       }
    curr.next = null;

    }
    void displayNodes()
	{

		Node current = head;
		if (head == null) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Nodes : ");
		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

    public static void main(String[] args) {
        DeleteNode dlt = new DeleteNode();
        dlt.addNode(10);
        dlt.addNode(20);
        dlt.addNode(30);
        dlt.displayNodes();
       
        System.out.println("Node after Removing");
        dlt.removeNode();
        dlt.displayNodes();
        
    }


    
}
