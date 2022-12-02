import java.util.Collections;
import java.util.Map;

public class GameWithString {

        static int minValue(String s, int k) {
            Map<Character, Integer> map = new HashMap <>();
            for(int i = 0; i < s.length(); i++) {
    
               map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    
            }
    
            Queue<Integer> pq = new PriorityQueue <>(Collections.reverseOrder());
    
            for(int a : map.values()) {
    
               pq.add(a);
    
            }
    
            while(k > 0) {
    
               int a = pq.poll();
    
               a--;
    
               pq.add(a);
    
               k--;
    
            }
    
            int res = 0;
    
            while(!pq.isEmpty()) {
    
               res += pq.peek() * pq.poll();
    
            }
    
            return res;
    
        }
    
    }

