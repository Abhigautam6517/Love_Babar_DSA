public class Countsay {
        public String countAndSay(int n) {
            if(n==1){
                return "1";
            }
            int counter=0;
            String res = "";
            String s = countAndSay(n-1);
            for(int i=0;i<s.length();i++){
                counter++;
                if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                    res = res+counter+s.charAt(i);
                    counter=0;
                }
            }
            return res;
        }
    }
    
