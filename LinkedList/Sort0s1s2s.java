import java.util.ArrayList;
import java.util.Collections;

public class Sort0s1s2s{
    class Node{
        int data;
        Node next;
    }

  static Node segregate(Node head)
    {
        Node temp = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        int i = 0;
        while(temp != null){
            temp.data = list.get(i);
            temp = temp.next;
            i++;
        }
        return head;

    }
}

