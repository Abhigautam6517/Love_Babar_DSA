import java.util.ArrayList;

public class ReverseStackRecursion {

    static void solve(Stack<Integer> s, ArrayList<Integer> ans)
    {
        if(s.isEmpty())
            return;
            
        int value=s.pop();
        ans.add(value);

        solve(s,ans);

        int val=ans.get(0);
        ans.remove(0);
        s.push(val);
    }
    
    static void reverse(Stack<Integer> s)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        solve(s,ans);
    }
}
    

