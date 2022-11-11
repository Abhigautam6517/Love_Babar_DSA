import java.util.ArrayDeque;

public class findthenextGreaterElement {
    
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
ArrayDeque<Long> stk=new ArrayDeque<>();
        long[] newarr=new long[n];
        newarr[n-1]=-1;
        stk.push(newarr[n-1]);
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[i]>=stk.peek()){
                stk.pop();
            }
            if(stk.isEmpty()){
                newarr[i]=-1;
            }
            else{
                newarr[i]=stk.peek();
            }
            stk.push(arr[i]);
        }
        return newarr;
    } 
}

