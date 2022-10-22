public class RemoveDuplicate {


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

    


    public static Node removeDuplicates(Node head) {
        Node root = head;
        while (head != null) {
            while (head.next != null && head.data == head.next.data)
                head.next = head.next.next;
                head = head.next;
        }
        return root;
    }

}
