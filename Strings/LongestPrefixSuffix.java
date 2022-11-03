public class LongestPrefixSuffix {
    int lps(String s) {
        
    int start = 0;
    int end = 1;
    int[] store = new int[s.length()];
    
    while( end < s.length() ){
        
        if( s.charAt(start) == s.charAt(end) ){
            store[end] = start+1;
            start+=1;
            end+=1;
        }
        else{
            
            if( start == 0){
                store[end] = 0;
                end=end+1;
            }else{
                start = store[start-1];
                }
            }
    }
        
    return store[s.length()-1];
    
    }

}
