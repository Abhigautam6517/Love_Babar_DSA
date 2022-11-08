public class DesignStack 
        public void push(int a,Stack<Integer> s){
            s.push(a);
        }
        public int pop(Stack<Integer> s){
                   return s.pop();
        }
        public int min(Stack<Integer> s){
                  int min=s.peek();
                  if(s.isEmpty()){
                      return -1;
                  }
                  for(int i=0; i<s.size(); i++){
                      if(min>s.get(i)){
                          min=s.get(i);
                      }
                  }
                  return min;
        }
        public boolean isFull(Stack<Integer>s, int n){
                  if(s.size()>=n){
                      return true;
                  }
                  return false;
        }
        public boolean isEmpty(Stack<Integer>s){
            return s.isEmpty();
        }
        
        
    
}
