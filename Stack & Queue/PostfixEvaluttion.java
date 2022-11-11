class Solution{
    public static int evaluatePostFix(String S){
            Stack<Integer> stack = new Stack<>();
            for(int i=0; i<S.length(); i++){
                char c= S.charAt(i);
                if(c >= '0' && c <= '9') stack.push(Integer.parseInt(String.valueOf(c)));
                else {
                    int c1 = stack.pop();
                    int c2 = stack.pop();
                    if(c == '*'){
                        stack.push(c1 *c2);
                    }else if(c == '/'){
                        stack.push(c2/c1);
                    }else if(c == '+'){
                        stack.push(c1+c2);
                    }else if(c == '-'){
                        stack.push(c2-c1);
                    }
                }
            }
            return stack.pop();
        }
    }