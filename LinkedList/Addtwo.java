public class Addtwo {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node reverseList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return head;
    }

    public static Node addTwoLists(Node first, Node second) {
        Node l1 = reverseList(first);
        Node l2 = reverseList(second);

        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;

            Node newNode = new Node(sum % 10);
            temp.next = newNode;
            temp = temp.next;
        }
        Node result = reverseList(dummy.next);
        return result;
    }
}
