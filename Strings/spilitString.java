public class spilitString {
        public static int maxSubStr(String str) {
            int count = 0;
            int zero=0, one=0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)=='0')
                    zero++;
                else 
                    one++;
                if(zero==one){
                    count++;
                    zero=0;
                    one=0;
                }    
            }
            if(zero!=0 || one!=0)
                count = -1;
           return count;
        }
    }
    