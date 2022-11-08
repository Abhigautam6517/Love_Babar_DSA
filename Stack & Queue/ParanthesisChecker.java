public class ParanthesisChecker {
    static boolean ispar(String x)
    Stack<Character> stack = new Stack<>();
        for(int i = 0; i<x.length(); i++){
            char ch = x.charAt(i);
            if( ch=='(' || ch=='[' || ch=='{' ){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    char ch1 = stack.peek();
                if(ch1 == '['&& ch==']' || ch1 == '{' && ch == '}' || ch1 =='(' && ch == ')'){
                    stack.pop();
                }else{
                    return false;
                }
                }else{
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else{
            return true;
        }
}
    
