public class ReverseDoubly {
    public class Node {
        int data;
        Node prev;
        Node next;
    }

    public static Node reverseDLL(Node head) {

        Node prev = null, cur = head;
        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            cur.prev = next;

            prev = cur;
            cur = next;
        }
        return prev;
    }

}
