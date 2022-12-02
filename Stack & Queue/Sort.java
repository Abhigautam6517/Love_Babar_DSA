public class Sort {

        public Stack<Integer> sort(Stack<Integer> s)
        {
        
    
      Stack<Integer> O = new Stack<>();
    
      Stack<Integer> tmp = new Stack<>();
    
      if(O.isEmpty()){
    
     O.push(s.pop());
    
      }
    
      while(!s.isEmpty()){ 
    
      if(!O.isEmpty() && s.peek() < O.peek()){
    
      tmp.push(O.pop());
    
      } else if (!tmp.isEmpty() &&
    
                                          tmp.peek() < s.peek()){
    
      O.push(tmp.pop());
    
      }  else {
    
      O.push(s.pop());
    
     while(!tmp.isEmpty()){
    
              O.push(tmp.pop());
      }
    
      }
    
      }  
    
      return O;
    
      }
        
    
    
}
