
import java.io.*;
import java.util.*;

public class ReverseString {
    public String reverse(String S){
      Stack<Character> st = new Stack<>();
        String ans="";
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
     return ans;
    }
    
}
