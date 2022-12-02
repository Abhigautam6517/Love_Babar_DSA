public class InsertStackUsingDequeue {

    static class DQueNode
    {
        int value;
        DQueNode next;
        DQueNode prev;
    }
    static class deque
    {
        private DQueNode head;
        private DQueNode tail;
        public deque()
        {
            head = tail = null;
        }
        
        // If list is empty
        boolean isEmpty()
        {
            if (head == null)
                return true;
                
            return false;
        }
    
        // count the number of nodes in list
        int size()
        {
            
            // If list is not empty
            if (!isEmpty())
            {
                DQueNode temp = head;
                int len = 0;
                
                while (temp != null)
                {
                    len++;
                    temp = temp.next;
                }
                return len;
            }
            return 0;
        }
        void insert_first(int element)
        {
            
            // Allocating node of DQueNode type
            DQueNode temp = new DQueNode();
            temp.value = element;
    
            // If the element is first element
            if (head == null)
            {
                head = tail = temp;
                temp.next = temp.prev = null;
            }
            else
            {
                head.prev = temp;
                temp.next = head;
                temp.prev = null;
                head = temp;
            }
        }
        void insert_last(int element)
        {
            DQueNode temp = new DQueNode();
            temp.value = element;
            if (head == null)
            {
                head = tail = temp;
                temp.next = temp.prev = null;
            }
            else
            {
                tail.next = temp;
                temp.next = null;
                temp.prev = tail;
                tail = temp;
            }
        }
        void remove_first()
        {
            if (!isEmpty())
            {
                DQueNode temp = head;
                head = head.next;
                head.prev = null;
    
                return;
            }
            System.out.print("List is Empty");
        }
        void remove_last()
        {
            if (!isEmpty())
            {
                DQueNode temp = tail;
                tail = tail.prev;
                if(tail!=null)
                {
                    tail.next = null;
                }
                return;
            }
            System.out.print("List is Empty");
        }
        void display()
        {
            if (!isEmpty())
            {
                DQueNode temp = head;
                
                while (temp != null)
                {
                    System.out.print(temp.value + " ");
                    temp = temp.next;
                }
    
                return;
            }
            System.out.print("List is Empty");
        }
    }
    
    static class Stack
    {
        deque d = new deque();
        public void push(int element)
        {
            d.insert_last(element);
        }
    
        // Returns size
        public int size()
        {
            return d.size();
        }
        public void pop()
        {
            d.remove_last();
        }
    
        // Display
        public void display()
        {
            d.display();
        }
    }
    
    // Class to implement queue using deque
    static class Queue
    {
        deque d = new deque();
        
        // enqueue to insert element at last
        // using insert at last function of deque
        public void enqueue(int element)
        {
            d.insert_last(element);
        }
    
        // dequeue to remove element from first
        // using remove at first function of deque
        public void dequeue()
        {
            d.remove_first();
        }
    
        // display
        public void display()
        {
            d.display();
        }
        
        // size
        public int size()
        {
            return d.size();
        }
    }
    
    // Driver Code
    public static void main(String[] args)
    {
        
        // Object of Stack
        Stack stk = new Stack();
    
        // push 7 and 8 at top of stack
        stk.push(7);
        stk.push(8);
        System.out.print("Stack: ");
        stk.display();
    
        // For new line
        System.out.println();
        
        // pop an element
        stk.pop();
        System.out.print("Stack: ");
        stk.display();
    
        // For new line
        System.out.println();
    
        // Object of Queue
        Queue que = new Queue();
    
        // Insert 12 and 13 in queue
        que.enqueue(12);
        que.enqueue(13);
        System.out.print("Queue: ");
        que.display();
    
        // New line
        System.out.println();
        
        // Delete an element from queue
        que.dequeue();
        System.out.print("Queue: ");
        que.display();
    
        // New line
        System.out.println();
        System.out.println("Size of stack is " +
                        stk.size());
        System.out.println("Size of queue is " +
                        que.size());
    }
    }