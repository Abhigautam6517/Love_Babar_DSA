package Array;

public class CheckPalindrome {
    public static int palinArray(int[] a, int n){
        for(int i=0;i<n;i++){
            if(!isPalindrome(a[i]))
                return 0;
        }
        return 1;
    }
    static boolean isPalindrome(int num){
        int copy = num;
        int rev = 0;
        while(num>0)
        {
            rev = rev*10 + num%10;
            num/=10;
        }
        if(copy == rev)
            return true;
        return false;
    }

    
}
