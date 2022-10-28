import java.util.ArrayDeque;
import java.util.HashMap;

public class firstNonRepeating {
    class Node{
        int data;
        Node next;
    }
    public String FirstNonRepeating(String s)
    {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        ArrayDeque<Character> q=new ArrayDeque<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c)==false)
            {
                q.add(c);
            }
            map.put(c,map.getOrDefault(c,0)+1);
            while(!q.isEmpty())
            {
                if(map.get(q.peek())>1)
                {
                    q.poll();
                }
                else
                {
                    sb.append(q.peek());
                    break;
                }
            }
            if(q.isEmpty())
            {
                sb.append('#');
            }
        }
        return sb.toString();
    }
}
    
