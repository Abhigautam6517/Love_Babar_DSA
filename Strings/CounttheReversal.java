public class CounttheReversal {
    int countRev (String s)
    {
        // your code here       
        int right = 0;
        int rev  = 0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch=='{')
            right++;
            else {
                if(right!=0)
                right--;
                else {
                    rev++;
                    right++;
                }
            }
        }
        if(right%2!=0)
        return -1;
        rev += right/2;
        return rev;
    }
}
    
