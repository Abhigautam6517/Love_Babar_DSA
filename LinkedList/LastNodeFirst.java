public class LastNodeFirst {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            Node next = null;
        }
    }

    void moveToFront(Node head)
    {
        if (head == null || head.next == null)
            return;
        Node secLast = null;
        Node last = head;
        while (last.next != null) {
            secLast = last;
            last = last.next;
        }
        secLast.next = null;
        last.next = head;
        head = last;
    }
    
}
