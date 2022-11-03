public class BracketBalancing {
        static int minimumNumberOfSwaps(String s) {
         int count = 0, open = 0;
         for (int i=0; i<s.length(); i++) {
             if ( s.charAt(i) == '[' ) {
                 open++;
             } else {
                 open--;
                 if (open < 0) {
                     count = count - open;
                 }
             }
         }
         return count;
     
         }
         public static void main(String[] args) {
            String s = "[][][";
            minimumNumberOfSwaps(s);
         }
     }
    
