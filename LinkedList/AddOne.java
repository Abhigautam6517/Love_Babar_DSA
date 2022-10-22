
class AddOne {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node addOne(Node head) {
        head = reverse(head);
        Node temp = head;
        Node pre = null;
        int carry = 1;
        while (temp != null) {
            int val = temp.data + carry;
            temp.data = val % 10;
            carry = val / 10;
            pre = temp;
            temp = temp.next;
        }
        // if (carry != 0)

        // {

        //     pre.next = new Node(carry);

        // }
        head = reverse(head);
        return head;

    }

    static Node reverse(Node head) {
        Node curr = head;
        Node pre = null;
        Node link = null;
        while (curr != null) {
            link = curr.next;
            curr.next = pre;
            pre = curr;
            curr = link;
        }
        head = pre;
        return head;
    }
}
