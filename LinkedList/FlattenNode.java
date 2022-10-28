import java.util.PriorityQueue;

public class FlattenNode{
    class Node{
        int data;
        Node next;
        public FlattenNode.Node bottom;
    }
   
Node flatten(Node root) {

    PriorityQueue<Node> pq = new PriorityQueue<Node>((a, b) -> a.data - b.data);



    Node current = new Node(); // create a new Node

    Node refNode = current;//store the reference of the new node before traversal

    while (root != null) {

      pq.add(root);//insert the root and other elements of the LL

      root = root.next;

    }



    while (!pq.isEmpty()) {

      Node temp = pq.poll();//pop the temp node

      current.bottom = temp;// connect the current node with the least that was popped

      current = current.bottom;// traverse the current node : [el1]--->[el2]

      if (temp.bottom != null) {

        pq.add(temp.bottom);//add the vertical elements 

      }

    }



    return refNode.bottom;

}}

