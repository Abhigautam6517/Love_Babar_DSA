class Reverse {
    public void reverseString(char[] s) {
        int n = s.length;
        int j = 0;
        char b[] = new char[n];
        for(int i=n-1;i>=0;i--){
             b[j] = s[i];
            j++;
        }
           // return b;
        System.arraycopy(b, 0, s, 0, s.length);
        
     
        
    }
}