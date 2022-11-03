import java.util.HashMap;

public class IsoMorphicString {
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        HashMap<Character,Character> map = new HashMap<>();
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i = 0;i<str1.length();i++){
            char p1 = str1.charAt(i);
            char p2 = str2.charAt(i);
            if(map.containsKey(p1)){
                if(map.get(p1)!=p2){
                    return false;
                }
            }
                else if(map.containsKey(p1)){
                    return false;
                }
                else{
                    map.put(p1,p2);
                }
                
            
        }
        return true;
        
        
    }
}
    
